package Chap1.A_ClassLoader.session3_RuntimeFlowOfClassLoader;

/**
 * 런타임 로딩은 클래스의 로드가 종료 되고 난 다음 실행 시에 클래스가 로드 되는 것을 런 타임 동적 로딩 이라 한다
 * RuntimeDynamicLoading
 */
public class B_RuntimeLoading {
    public static void main(String[] args) 
    		throws ClassNotFoundException, 
    				IllegalAccessException, 
    				InstantiationException{
        // Class.forName은 ClassNotFoundException 을 발생할 수 있다.
        Class<?> exampleClass = 
        		Class.forName("Chap1.A_ClassLoader.session3_RuntimeFlowOfClassLoader.RuntimeExampleClass");
        // newInstance는 IllegalAccessException, InstantiationExceptio 를 발생 할 수 있다
        RuntimeExampleClass rec = (RuntimeExampleClass) exampleClass.newInstance();
        rec.run();
    }
}

class RuntimeExampleClass{
    static{
        System.out.println("Example Ready ~!");
    }
    public void run(){
        System.out.println("Example Run ~!");
    }
}