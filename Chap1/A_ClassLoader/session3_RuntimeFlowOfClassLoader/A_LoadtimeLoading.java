package Chap1.A_ClassLoader.session3_RuntimeFlowOfClassLoader;

import java.io.File;

/**
 * 로드 시 연쇄적으로 로딩 되는 것을 로드 타임 다이나믹 로딩 이라고 한다
 * LoadTimeDynamicLoading
 */
public class A_LoadtimeLoading {
    static{
        System.out.println("Meu Meu ~ ~ !!");
    }
    public static void main(String[] args){
        // 메인 클레스를 로드 하면서 연쇄적으로 로드 되는 클래스가 있다
        // String 과 System 클래스 이다.
        // 또한 그 외에도 InputStream 과 여러 연쇄적인 클래스가 있다
        // 이 처럼 로드 타임 동적 로딩은 하나의 클래스를 로드 할 때
        // 연속 적으로 의존 하는 클래스를 동적으로 로드 되는 것이다.
        String name = "I\'m Hero";
        System.out.println(name);
    }
}
