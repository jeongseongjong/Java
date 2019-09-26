package Chap1.A_ClassLoader.session2_HowManyClassLoader;

/**
 * BootstrapClassLoader의 속성을 확인 해 보자
 */
public class A_BootstrapClassLoader {
	public static int age = 1;
    public static void main(String[] args){
        // 자바의 기본 라이브러리 들이 적재 되어 있는 경로를 확인 한다
        // resources.jar 와 rt.jar 가 등록 되어 있는지 확인 해 본다
        String classLoadPath = System.getProperty("sun.boot.class.path");
        System.out.println(classLoadPath.contains("resources.jar"));
        System.out.println(classLoadPath.contains("rt.jar"));

    }
}
