package Chap1.B_RuntimeDataArea.session1_MethodArea;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

import javax.annotation.Resource;

public class C_FieldInformation {
	

	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchFieldException, SecurityException {
		Class<FieldTestClass> clazz = 
				(Class<FieldTestClass>) Class.forName("Chap1.B_RuntimeDataArea.session1_MethodArea.FieldTestClass");
		FieldTestClass o = (FieldTestClass)clazz.newInstance();
		
		// 테스트를 위한 템플릿 클래스 할당
		TemplateClass t = new TemplateClass();
		
		v(">>>>>>>>>>>> 필드 접근 제한자를 출력한다  <<<<<<<<<<<<");
		s("Public Modifiers : "					+clazz.getField("puS").getModifiers()			);
		s("Private Modifiers : "				+clazz.getDeclaredField("prS").getModifiers()	);
		s("Protected Modifiers : "				+clazz.getDeclaredField("poS").getModifiers()	);
		s("Default Modifiers : "				+clazz.getDeclaredField("dfS").getModifiers()	);
		s(""); // Static Field 를 출력한다 
		s("Static Public Modifiers : "			+clazz.getField("spuS").getModifiers()			);
		s("Static Private Modifiers : "			+clazz.getDeclaredField("sprS").getModifiers()	);
		s("Static Protected Modifiers : "		+clazz.getDeclaredField("spoS").getModifiers()	);
		s("Static Default Modifiers : "			+clazz.getDeclaredField("sdfS").getModifiers()	);
		s(""); // Final Static Field 를 출력한다 
		s("Final Static Public Modifiers : "	+clazz.getField("fspuS").getModifiers()			);
		s("Final Static Private Modifiers : "	+clazz.getDeclaredField("fsprS").getModifiers()	);
		s("Final Static Protected Modifiers : "	+clazz.getDeclaredField("fspoS").getModifiers()	);
		s("Final Static Default Modifiers : "	+clazz.getDeclaredField("fsdfS").getModifiers()	);
		
		v(">>>>>>>>>>>> 필드 명을 출력한다  <<<<<<<<<<<<");
		s("puS Name : "+clazz.getField("puS").getName()			);
		s("prS Name : "+clazz.getDeclaredField("prS").getName()	);
		s("poS Name : "+clazz.getDeclaredField("poS").getName()	);
		s("dfS Name : "+clazz.getDeclaredField("dfS").getName()	);
		
		v(">>>>>>>>>>>> 필드 값을 출력 한다  <<<<<<<<<<<<");
		// public 필드 출력
		s("puS Name : "+clazz.getField("puS").get(o));
		
		// private, protected, default 값 출력
		Field SF1 = clazz.getDeclaredField("prS");
		SF1.setAccessible(true);
		s("prS Name : "+SF1.get(o));

		
		Field SF2 = clazz.getDeclaredField("poS");
		SF2.setAccessible(true);
		s("poS Name : "+SF2.get(o));
		
		Field SF3 = clazz.getDeclaredField("dfS");
		SF3.setAccessible(true);
		s("poS Name : "+SF3.get(o));
		
		// 아래와 같이 유틸화 할 수 있다.
		s("Module Value puS : "+t.getDeclareFeildValue(o, "puS"));
		s("Module Value prS : "+t.getDeclareFeildValue(o, "prS"));
		s("Module Value poS : "+t.getDeclareFeildValue(o, "poS"));
		s("Module Value dfS : "+t.getDeclareFeildValue(o, "dfS"));
		
		v(">>>>>>>>>>>> 필드에 인자를 등록 및 수정 한다  <<<<<<<<<<<<");
		String beforeString, afterString;
		int beforeInt, afterInt;
		
		// Public 필드를 수정해 보자
		Field F0 = clazz.getDeclaredField("puS");
		beforeString = (String) F0.get(o);
		F0.set(o, "Updated");
		afterString = (String) F0.get(o);
		s("puS Before Value : ("+beforeString+") After Value : ("+afterString+")");
		
		Field F1 = clazz.getDeclaredField("puI");
		beforeInt = F1.getInt(o);
		F1.setInt(o, 999);
		afterInt = F1.getInt(o);
		s("puI Before Value : ("+beforeInt+") After Value : ("+afterInt+")");
		
		// private 필드를 수정해 보자
		Field F2 = clazz.getDeclaredField("prS");
		F2.setAccessible(true);
		beforeString = (String) F2.get(o);
		F2.set(o, "Updated");
		afterString = (String) F2.get(o);
		s("prS Before Value : ("+beforeString+") After Value : ("+afterString+")");
		
		Field F3 = clazz.getDeclaredField("prI");
		F3.setAccessible(true);
		beforeInt = F3.getInt(o);
		F3.setInt(o, 999);
		afterInt = F3.getInt(o);
		s("puI Before Value : ("+beforeInt+") After Value : ("+afterInt+")");
		
		v(">>>>>>>>>>>> 필드 타입을 출력 한다  <<<<<<<<<<<<");
		s("puS Type : "+clazz.getField("puS").getType());
		s("puS Type : "+clazz.getField("puI").getType());
		
		Field F4 = clazz.getField("annotationFeildWriteValue");
		Field F5 = clazz.getField("annotationFeildDefaultValue");
		v(">>>>>>>>>>>> 어노테이션 필드와 값을 출력 한다  <<<<<<<<<<<<");
		// 어노테이션을 로드 한다
		s("Resource Annotation Impliement ? : "+F4.getAnnotation(Resource.class));
		s("annotationField Annotation Impliement ? : "+F4.getAnnotation(annotationField.class));
		// 어노테이션의 값을 로드 한다
		s("annotationFeildWriteValue Value is : "+F4.getAnnotation(annotationField.class).value());
		s("annotationFeildDefaultValue Value is : "+F5.getAnnotation(annotationField.class).value());
		
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

class TemplateClass{
	public Object getDeclareFeildValue(Object O, String FieldName) 
			throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException{
		Field ff = null;
		try{
			ff = O.getClass().getDeclaredField(FieldName);
			ff.setAccessible(true);
		}catch(Exception e){
			try{
				ff = O.getClass().getField(FieldName);
			}catch(NoSuchFieldException e2){
				throw new NoSuchFieldException();
			}
		}
		return ff.get(O);
	}
}

class FieldTestClass{
	
	// 접근 제한자 클래스 필드 
	public String puS = "PUS";
	public int puI = 1;
	private String prS = "PRS";
	private int prI = 2;
	protected String poS = "POS";
	protected int poI = 3;
	String dfS = "DFS";
	int dfI = 4;
	
	// 전역 접근 제한자 클래스 필드
	public static String spuS = "PUS";
	public static int spuI = 1;
	private static String sprS = "PRS";
	private static int sprI = 2;
	protected static String spoS = "POS";
	private static int spoI = 3;
	static String sdfS = "DFS";
	static int sdfI = 4;
	
	// 상수 전역 접근 제한자 클래스 필드
	final public static String fspuS = "PUS";
	final public static int fspuI = 1;
	final private static String fsprS = "PRS";
	final private static int fsprI = 2;
	final protected static String fspoS = "POS";
	final private static int fspoI = 3;
	final static String fsdfS = "DFS";
	final static int fsdfI = 4;
	
	// 어노테이션을 필드에 적용 한다
	@annotationField
	public int annotationFeildDefaultValue;
	@annotationField(value=50)
	public int annotationFeildWriteValue;
	
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@interface annotationField{
	int value() default 1;
}