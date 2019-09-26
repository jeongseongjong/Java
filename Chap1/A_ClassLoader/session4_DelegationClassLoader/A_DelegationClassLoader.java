package Chap1.A_ClassLoader.session4_DelegationClassLoader;

/**
 * 클래스 로더의 델리게이션은 캐시 -> 부모 -> 자신 순으로 이루어 진다.
 * Delegation Model for ClassLoader
 */
public class A_DelegationClassLoader {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 먼저 델리게이션 모델을 정의해 보자.
		// 객층을 가진 classLoader c1, c2, c3를 정의한다
		// 모델은 아래와 같다.
		// appClassLoader
		//		|
		//		+-- c1
		//		|	|
		//		|	+-- c3
		//		|
		//		+--	c2
		
		ClassLoader c1 = new ClassLoader() {};
		ClassLoader c2 = new ClassLoader() {};
		ClassLoader c3 = new ClassLoader(c1) {};
		
		// getParent 메서드를 사용 하여 ClassLoader의 객층을 확인해 보자.
		System.out.println("c1 parent is appClassLoader ? : " + ( c1.getParent() == ClassLoader.getSystemClassLoader() ) );
		System.out.println("c2 parent is appClassLoader ? : " + ( c2.getParent() == ClassLoader.getSystemClassLoader() ) );
		System.out.println("c3 parent is c1 ? : "+(c3.getParent() == c1));
		
		// 작성한 ClassLoder로 class를 로드 해 보자
		// 모두 동일한 클래스 로더를 사용하여 로드 한다는 것을 알 수 있다.
		Class cls3 = c3.loadClass("Chap1.A_ClassLoader.session4_DelegationClassLoader.A");
		Class cls2 = c2.loadClass("Chap1.A_ClassLoader.session4_DelegationClassLoader.A");
		Class cls1 = c1.loadClass("Chap1.A_ClassLoader.session4_DelegationClassLoader.A");
		// 증복 로드 된 클래스의 로더 확인
		System.out.println("class1 is : "+cls1.getClassLoader());
		System.out.println("class2 is : "+cls2.getClassLoader());
		System.out.println("class3 is : "+cls3.getClassLoader());
		// 중복 로드 된 클래스를 인스턴스화
		cls1.newInstance();
		cls2.newInstance();
		cls3.newInstance();
		
		// 왜 한번 밖에 클레스가 로드 되지 않을까?
		// 그러면 AClass의 클래스 로더를 확인해 보자.
		// AppClassLoader임을 확인 할 수 있다.
		// 여기서 확인 된 결과는 사용자 정의 ClassLoader를 사용 하여 Class를 로드 하더라도
		// 상위 parent인 AppClassLoader로 위임 하여 AppClassLoader로 로드 된다는 점이다
		// 먼저 클래스 생성권한을 상위 클래스에게 위임하는 구조가 델리게이션이라고 이해 하고 넘어 가자.
		System.out.println("(A class)Class Loder : "+A.class.getClassLoader());
		
	}
}
/**
 * 사용자 클래스를 정의한다
 */
class A{
	static{
		System.out.println("A ready ~! ");
	}
}