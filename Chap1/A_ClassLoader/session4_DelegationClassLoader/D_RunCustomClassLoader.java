package Chap1.A_ClassLoader.session4_DelegationClassLoader;

public class D_RunCustomClassLoader {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		// 델리게이션을 확인 한다.
		new AA();
		
		// getSystemClassLoader로 로드 시 등록 된 클래스 로더를 확인 한다
		ClassLoader.getSystemClassLoader()
						.loadClass("Chap1.A_ClassLoader.session4_DelegationClassLoader.CC")
							.newInstance();
		
		// Class.forName 으로 클래스 로드를 등록 하여 확인 한다.
		Class<?> c = Class.forName("Chap1.A_ClassLoader.session4_DelegationClassLoader.CC");
		
		ClassLoader.getSystemClassLoader()
						.loadClass("Chap1.A_ClassLoader.session4_DelegationClassLoader.F_DelecationSample");
		
		// Class.ForName을 이용한 명시적 ClassLoader 사용
		Class<?> clazz = 
				Class.forName("Chap1.A_ClassLoader.session4_DelegationClassLoader.F_DelecationSample", true, ClassLoader.getSystemClassLoader());
		
		F_DelecationSample sample = (F_DelecationSample) clazz.newInstance();
		sample.show();
		
	}
}


class AA extends BB{
	static{
		System.out.println("AA class Loaded");
	}
	public void show(){
		System.out.println("AA");
	}
}
class BB{
	static{
		System.out.println("BB class Loaded");
	}
	public void show(){
		System.out.println("BB");
	}
}
class CC{
	static{
		System.out.println("CC class Loaded");
	}
	public void show(){
		System.out.println("CC");
	}
}