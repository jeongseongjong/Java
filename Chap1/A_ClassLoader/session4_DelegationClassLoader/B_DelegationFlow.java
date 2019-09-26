package Chap1.A_ClassLoader.session4_DelegationClassLoader;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * Delegation의 순서를 이해 하고 넘어 가자
 * 맨 처음 봤을 경우는 어려울 수 있다. 
 * 하지만 자바를 이루는 근간이 클래스 로더 시스템이니 꾸준히 보도록 하자.
 * Flow of Delegation-Model on ClassLoader
 */
public class B_DelegationFlow {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 먼저 Delegation 순서를 보자.
		// Class를 찾을 때는 Cache -> Parent -> Self 라는 순서를 가진다.
		// 순서는 간단하다.
		// 1. classLoad이벤트가 발생 시 클래스 로더에 캐시 되어 있으면 자신의 캐시된 클래스를 반환, 그렇지 않으면 부모에게 위임
		// 2. 마지막까지 가서 찾지 못한다면 다시 돌아 가면서 findClass를 콜하여 자신의 클래스 로더에서 class를 찾음
		// 3. 처음 클래스 로더로 돌아 가서도 찾지 못하면 ClassNotFoundException 발생
		
		// 1. 클래스 로더를 작성한다.
		ClassLoader cl1 = new ClassLoader() {
			@Override
			protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
				System.out.println("run ClassLoader 1");
				return super.loadClass(name, resolve);
			}
		};
		
		ClassLoader cl2 = new ClassLoader(cl1) {
			@Override
			protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
				System.out.println("run ClassLoader 2");
				return super.loadClass(name, resolve);
			}
		};
		
		// ClassLoader 2가 실행 된 직 후 ClassLoader 1이 실행 된다.
		// 델리게이션이 일어 났다는 의미 이다.
		// 그렇다면 왜 이런 현상이 일어 나는 것일까?
		// 그건 바로 클래스의 반복적인 로드를 막기 위함이다.
		// 이전에도 말한바가 있듯이 클래스로드는 상위 계층으로는 참조가 가능 하지만
		// 하위 계층으로는 참조가 불 가능하다.
		// 따라서 동일한 클래스를 올리는 불 필요한 메모리 누수를 막기 위함이다.
		// 아래는 생성한 클래스 로더 상에서 파일인 클래스를 읽어 
		// 메모리에서 로드를 가로 채는 클래스를 정의 하였다.
		// 어떤 현상이 일이 날지 한번 생각해 보자.
		System.out.println("--------------- 클래스 로더 델리게이션 -------------");
		cl2.loadClass("Chap1.A_ClassLoader.session4_DelegationClassLoader.AClass");
		System.out.println(AClass.class.getClassLoader());
		
		// 중복된 클래스 로드 및 링킹
		// 동일 하지만 모두 다른 클래스 로더를 가리키는 것을 알 수 있다.
		System.out.println("--------------- 중복 클래스 로드 및 링킹 -------------");
		ClassLoader loader1 = new SimpleClassLoader();
		System.out.println(loader1);
		
		// 동일 클래스 로더의 중복은 캐싱 메모리 처리로 리턴 한다
		Class<?> c0 = loader1.loadClass("Chap1.A_ClassLoader.session4_DelegationClassLoader.BClass");
		Class<?> c1 = loader1.loadClass("Chap1.A_ClassLoader.session4_DelegationClassLoader.BClass");
		System.out.println("MainClassLoader : "+c1.getClassLoader());
		System.out.println("c1 == c0 : "+(c1 == c0));
		ClassLoader loader2 = new SimpleClassLoader();
		
		// 중복 된 클래스 로드
		// 다른 클래스 로더를 가르키고 있는걸 알 수 있다.
		Class<?> c2 = loader2.loadClass("Chap1.A_ClassLoader.session4_DelegationClassLoader.BClass");
		System.out.println("MainClassLoader : "+c2.getClassLoader());
		
		// 계층 관계를 형성화 시킨 후 클래스를 로드 한다
		// loader1
		//	 |
		// 	 +-- loader3
		ClassLoader loader3 = new SimpleClassLoader(loader1);
		Class<?> c3 = loader3.loadClass("Chap1.A_ClassLoader.session4_DelegationClassLoader.BClass");
		System.out.println("SubClassLoader : "+c3.getClassLoader());
		
	}
}

class AClass{

}
class BClass extends NClass{

}
class NClass{
	
}


class SimpleClassLoader extends ClassLoader {

	public SimpleClassLoader(ClassLoader loader) {super(loader);}

	public SimpleClassLoader() { super();}

	/**
	 * 클래스를 불러 오는 메서드
	 * @param name 불러올 클래스 경로명 
	 * @return 생성 되어 캐싱 된 클래스
	 * @throws ClassNotFoundException
	 */
	private Class<?> getClass(String name) throws ClassNotFoundException {
		String file = name.replace(".", File.separator)+ ".class";
		try{
			byte[] buff = loadFileToByte(file);
			resolveClass(defineClass(name, buff, 0, buff.length));
			return this.findLoadedClass(name);
		}catch(IOException e){
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 파일 시스템으로 부터 바이트 단위로 읽어 클래스를 캐싱 한다.
	 * @param file file경로명
	 * @return 바이트 단위로 직렬화 된 데이터
	 * @throws IOException
	 */
	private byte[] loadFileToByte(String file) throws IOException{
		InputStream stream = this.getResourceAsStream(file);
		int size = stream.available();
		byte[] buff = new byte[size];
		DataInputStream dis = new DataInputStream(stream);
		dis.readFully(buff);
		return buff;
	}

	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		// 목 테스트를 위하여 AppClassLoader는 델리게이션에서 제외 시킨다.
		if(this.getParent() != ClassLoader.getSystemClassLoader()){
			return this.getParent().loadClass(name);
		}
		// 동일한 클래스의 검색 후 리턴
		if(this.findLoadedClass(name)!=null)return this.findLoadedClass(name);

		if(name.contains(".BClass") || name.contains(".NClass")){
			return getClass(name);
		}
		return super.loadClass(name);
	}
}
