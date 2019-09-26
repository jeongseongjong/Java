package Chap1.B_RuntimeDataArea.session1_MethodArea;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Z_Annotation {

}

// 어노 테이션 스팩에 관해서는 추후 확장 하겠다.
@Retention(RetentionPolicy.RUNTIME) 	// 컴파일 이후에도 JVM에 의해서 참조.
//@Retention(RetentionPolicy.CLASS) 	// 컴파일러가 클래스를 참조할 때까지 유효.
//@Retention(RetentionPolicy.SOURCE) 	// 어노테이션 정보는 컴파일 이후 소멸.
@Target({
    ElementType.PACKAGE, 			// 패키지 선언시
    ElementType.TYPE, 				// 타입 선언시
    ElementType.CONSTRUCTOR, 		// 생성자 선언시
    ElementType.FIELD, 				// 멤버 변수 선언시
    ElementType.METHOD, 			// 메소드 선언시
    ElementType.ANNOTATION_TYPE, 	// 어노테이션 타입 선언시
    ElementType.LOCAL_VARIABLE, 	// 지역 변수 선언시
    ElementType.PARAMETER, 			// 매개 변수 선언시
    ElementType.TYPE_PARAMETER, 	// 매개 변수 타입 선언시
    ElementType.TYPE_USE 			// 타입 사용시
})
@interface S_AnnotationClass{
	int value() default -1;
}

class AnnotationInjection{
	
	@S_AnnotationClass
	private int injectedIntDefault;
	
	@S_AnnotationClass(value=10)
	private int injectedIntValue;
	
	public int getInjectedIntDefault() {
		return injectedIntDefault;
	}
	public int getInjectedIntValue() {
		return injectedIntValue;
	}
	
}