package Chap1.B_RuntimeDataArea.session1_MethodArea;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.annotation.Resource;

public class A_ClassInformation {
	public static void main(String[] args) {
		
		
		// 클래스 타입명 확인
		v(">>>>>>>>>>>> 클래스 타입명 확인 <<<<<<<<<<<<");
		s("ClassTypeName is : "+SimpleClass		.class.getTypeName());
		
		// 클래스 java.lang.reflect.Modifie 의 표를 참조 하자.
		// 접근 제한 확인 public/final/abstact
		v(">>>>>>>>>>>> 클래스 접근 제한자 <<<<<<<<<<<<");
		s("Default is : "	+SimpleClass	.class.getModifiers());
		s("Final is : "		+FinalClass		.class.getModifiers());
		s("Abstract is : "	+AbstractClass	.class.getModifiers());
		s("Interface is : "	+InterfaceClass	.class.getModifiers());
		
		// 상속 관계 확인
		// 인터페이스는 상속관계를 확인
		v(">>>>>>>>>>>> 클래스 상속 관계 <<<<<<<<<<<<");
		s("Normal : "		+SimpleClass		.class.getSuperclass());
		s("Extended : "		+ExtendedClass		.class.getSuperclass());
		s("Interface : "	+InterfaceClass		.class.getSuperclass());
		
		// 클래스가 정의 된 패키지 확인
		v(">>>>>>>>>>>> 패키지 <<<<<<<<<<<<");
		s("Pakage Name : "	+SimpleClass		.class.getPackage());
		
		// 클래스가 정의 된 패키지 확인
		v(">>>>>>>>>>>> 클래스 생성 시 환경 <<<<<<<<<<<<");
		s(SimpleClass		.class.getProtectionDomain());
		
		// 어노테이션에 관한 정보 확인
		v(">>>>>>>>>>>> (어노테이션) 인터페이스 여부 <<<<<<<<<<<<");
		s("SimpleClass class is Annotation ? : "	+SimpleClass			.class.isAnnotation());
		s("isAnnotation class is Annotation ? : "	+AnnotationInterface	.class.isAnnotation());
		
		v(">>>>>>>>>>>> (어노테이션)(1)을 구현한 클래스의 상위 인터페이스 타입 <<<<<<<<<<<<");
		s(AnnotationClass		.class.getAnnotatedInterfaces());
		
		v(">>>>>>>>>>>> (어노테이션)(N)을 구현한 클래스의 상위 인터페이스 명 <<<<<<<<<<<<");
		for(Annotation ann : AnnotationClass.class.getAnnotations()) {
			s(ann.annotationType().getSimpleName());
		}

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
class SimpleClass {}
class ExtendedClass extends SimpleClass{}
final class FinalClass {}
abstract class AbstractClass {}
interface InterfaceClass {}

@Resource
@AnnotationInterface
class AnnotationClass{}

@ExtrndAnnotstion
@Retention(RetentionPolicy.RUNTIME)
@interface AnnotationInterface{}

@Inherited
@interface ExtrndAnnotstion{}