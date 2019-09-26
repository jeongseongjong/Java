package Chap1.B_RuntimeDataArea.session1_MethodArea;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.sun.org.apache.bcel.internal.classfile.ConstantObject;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

public class B_MethodInfotmation {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		MethodTestClass o = new MethodTestClass();
		Class<MethodTestClass> clazz = MethodTestClass.class;
		// 메서드 정보를 출력 한다.
		v(">>>>>>>>>>>> 메서드 명을 출력한다 <<<<<<<<<<<<");
		System.out.println("Method Name (runNoParametersTest) is : "+clazz.getMethod("runNoParametersTest", null).getName());

		// 클래스 java.lang.reflect.Modifie 의 표를 참조 하자.
		// 접근 제한 확인 public/final/abstact
		v(">>>>>>>>>>>> 메서드 접근 제한자를 출력한다 <<<<<<<<<<<<");
		s("Default is : "	+clazz.getMethod("methodPublicAndVoid", null).getModifiers());
		s("Default is : "	+clazz.getDeclaredMethod("methodDefaultAndVoid", null).getModifiers());
		s("Default is : "	+clazz.getDeclaredMethod("methodPrivateAndVoid", null).getModifiers());
		s("Default is : "	+clazz.getDeclaredMethod("methodProtectedAndVoid", null).getModifiers());
		
		// Public 메서드를 불러 온다.
		v(">>>>>>>>>>>> public 메서드를 불러 온다 <<<<<<<<<<<<");
		Method[] methods = clazz.getMethods();
		for(Method m : methods) {
			s("Public("+m.getName()+")");
		}
		// 접근 제한이 걸린 메서드를 불러 온다.
		v(">>>>>>>>>>>> private 메서드를 불러 온다 <<<<<<<<<<<<");
		s("private("+MethodTestClass.class.getDeclaredMethod("methodPrivateAndVoid", null).getName()+")");
		
		//메서드를 실행 한다
		v(">>>>>>>>>>>> 메서드를 실행 한다 <<<<<<<<<<<<");
		
		// public 메서드를 리플랙션으로 실행 한다.
		clazz.getMethod("runNoParametersTest", null).invoke(o, null);
		clazz.getMethod("runPOneParametersTest", String.class).invoke(o, "S1");
		clazz.getMethod("runNParametersTest", String.class, String.class).invoke(o, "S1", "S2");
		
		// private 매서드를 리플랙션으로 실행
		Method m = clazz.getDeclaredMethod("runPNoParametersTest", null); // 1. declaredMethod로 내부 메서드를 불러 온다
		m.setAccessible(true); // 2. 메서드 실행 제한을 푼다.
		m.invoke(o, null);     // 3. 메서드로 실행한다.
		
		// 메서드 생성자
		v(">>>>>>>>>>>> 클래스 생성자 메서드 실행 <<<<<<<<<<<<");
		// 인자가 없는 public 생성자를 찾는다.
		Constructor<?> con1 =  clazz.getConstructor(null);
		// 생성자를 통한 인스턴스 생성
		MethodTestClass ins1 = (MethodTestClass) con1.newInstance();
		
		// 인자가 존재하는 public 생성자를 찾는다.
		Constructor<?> con2 = clazz.getConstructor(String.class);
		// 생성자를 통한 인스턴스 생성
		MethodTestClass ins2 = (MethodTestClass) con2.newInstance("String Arguments");
		
		// 인자가 존재하는 private 생성자를 찾는다.
		Constructor<?> con3 = clazz.getDeclaredConstructor(String.class,int.class);
		con3.setAccessible(true);
		MethodTestClass ins3 = (MethodTestClass) con3.newInstance("String Arguments", 50);
		
		// 어노테이션
		v(">>>>>>>>>>>> 메서드 어노테이션에 관한 설정 정보 <<<<<<<<<<<<");
		Method am = clazz.getMethod("annotationMethod", int.class);
		
		System.out.println("Method Return Type is String class ? : "+ ( am.getReturnType() == String.class ));
		System.out.println("Method Return Type is void class ? : "  + ( am.getReturnType() == void.class ));
		
		System.out.println("Method ParameterCount is : "+am.getParameterCount());
		System.out.println("Method ParameterCount is : "+am.getParameterCount());

		am.invoke(o, 0);
	}
	public static void s(Object o) {
		System.out.println(o);
	}
	public static void v(Object o) {
		System.out.println();
		System.out.println(o);
		System.out.println();
	}
}

class MethodTestClass{
	
	private String constArg1;
	private int constArg2;
	
	/**
	 * default constructor
	 * 기본 생성자
	 */
	public MethodTestClass() {
		super();
		System.out.println("No Arguments Construction Created");
	}
	
	/**
	 * parameter constructor
	 * 인자를 지닌 생성자
	 */
	public MethodTestClass(String constArg1) {
		super();
		this.constArg1 = constArg1;
		System.out.println("One Arguments Construction Created :"+constArg1);
	}
	/**
	 * parameter private constructor
	 * 인자를 지닌 내부 생성자
	 */
	private MethodTestClass(String constArg1, int constArg2) {
		super();
		this.constArg1 = constArg1;
		this.constArg2 = constArg2;
		System.out.println("Two Arguments Construction Created : "+constArg1+", "+constArg2);
	}
	
	/**
	 * 접근 권한이 [ public ] 이고 리턴이 [ void ]인 메서드
	 */
	public void runNoParametersTest() {
		System.out.println("no Parameters Run");
	}
	
	/**
	 * 접근 권한이 [ private ] 이고 리턴이 [ void ] 인 메서드
	 */
	private void runPNoParametersTest() {
		System.out.println("no Parameters Run");
	}
	
	/**
	 * 접근 권한이 [ public ] 이고 리턴이 [ void ] 이고 [ 1 ]개의 인자를 지닌 메서드
	 */
	public void runPOneParametersTest(String a) {
		System.out.println("parameters : "+a);
	}
	
	/**
	 * 접근 권한이 [ public ] 이고 리턴이 [ void ] 이고 [ 2 ]개의 인자를 지닌 메서드
	 */
	public void runNParametersTest(String a, String b) {
		System.out.println("parameters : "+a+","+b);
	}
	
	/**
	 * 접근 권한이 [ private ] 이고 리턴이 [ void ] 인 메서드
	 */
	private void methodPrivateAndVoid() {
		System.out.println("Private Void Method Run");
	}
	
	/**
	 * 접근 권한이 [ private ] 이고 리턴이 [ String ] 인 메서드
	 */
	private String methodPrivateAndString() {
		System.out.println("private String Method Run");
		return "";
	}
	
	/**
	 * 접근 권한이 [ protected ] 이고 리턴이 [ void ] 인 메서드
	 */
	protected void methodProtectedAndVoid() {
		System.out.println("Protected Void Method Run");
	}
	
	/**
	 * 접근 권한이 [ protected ] 이고 리턴이 [ String ] 인 메서드
	 */
	protected String methodProtectedAndString() {
		System.out.println("Protected String Method Run");
		return "";
	}
	
	/**
	 * 접근 권한이 [ protected ] 이고 리턴이 [ void ] 인 메서드
	 */
	void methodDefaultAndVoid() {
		System.out.println("Protected Void Method Run");
	}
	
	/**
	 * 접근 권한이 [ protected ] 이고 리턴이 [ String ] 인 메서드
	 */
	protected String methodDefaultAndString() {
		System.out.println("Protected String Method Run");
		return "";
	}
	
	/**
	 * 접근 권한이 [ public ] 이고 리턴이 [ void ] 인 메서드
	 */
	public void methodPublicAndVoid() {
		System.out.println("Public Void Method Run");
	}
	
	/**
	 * 접근 권한이 [ public ] 이고 리턴이 [ String ] 인 메서드
	 */
	public String methodPublicAndString() {
		System.out.println("public String Method Run");
		return "";
	}
	
	/**
	 * 접근 권한이 [ public ] 이고 리턴이 [ String ] 이며 어노테이션을 구현한 메서드
	 * 해당 메서드의 어노테이션을 구현할 때 ElementType.METHOD <<-- 타겟이 구현 되어 있어야 한다.
	 */
	@methodAnnotation(value=50)
	public String annotationMethod(int value){
		System.out.println("value is : "+value);
		return "";
	}
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@interface methodAnnotation{
	int value() default 1;
}