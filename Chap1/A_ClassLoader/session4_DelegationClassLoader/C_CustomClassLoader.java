package Chap1.A_ClassLoader.session4_DelegationClassLoader;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 커스텀 클래스 로더를 작성해 보자.
 * 이전 B에서 이미 다 완성 되어 있다 여기서는 좀 더 델리게이션에 신경을 써서 작성을 해 보자.
 * Delegation-Model In CustomClassLoder
 * 이클립스의 경우 jvm의 기본 ClassLoader를 변경 할 수 있다.
 * run application의 jvm속성에
 * -Djava.system.class.loader = 경로명
 * 을 등록 하여 실행 하자
 * 또는 CMD창에서 -Djava.system.class.loader=경로명 파일명 으로 실행하자.
 */
public class C_CustomClassLoader extends ClassLoader{
	// 캐싱을 위한 캐시 객체
	private Map<String, Class<?>> cache = new HashMap<>();
	
	// 부모 객체를 받을 생성자 구현 ExtClssLoader, BootstrapClassLoader
    public C_CustomClassLoader(ClassLoader parent) {
        super(parent);
    }
    
	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		// 1. 해당 클래스를 캐싱 처리.
		if(cache.get(name)!=null){
			System.out.println("use cached object");
			return cache.get(name);
		}
		Class<?> c = null;
		System.out.println("Load Class : [ "+name+" ]");
		if(name.startsWith("Chap1.A_ClassLoader.session4_DelegationClassLoader")){
			System.out.println("---------> filter Class : [ "+name+" ]");
			try {
				
				DataInputStream dis = new DataInputStream(this.getResourceAsStream(name.replace(".", "/")+".class"));
				byte[] buffer = new byte[dis.available()];
				dis.readFully(buffer);
				
				c = defineClass(name, buffer, 0, buffer.length);
				resolveClass(c);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		} else {
			c = super.loadClass(name);
		}
		cache.put(name, c);
		return c;
	}
}
