package Chap1.A_ClassLoader.session2_HowManyClassLoader;

/**
 * ExtClassLoader 의 속성을 확인해 보자
 */
public class B_ExtentionClassLoader {
    public static void main(String[] args){
        // 자바의 확장 라이브러리 들이 적재 되어 있는 공간
        // 경로를 확인 해 본다
        String extClassLoaderPath = System.getProperty("java.ext.dirs");
        System.out.println(extClassLoaderPath);
        
    }
}
