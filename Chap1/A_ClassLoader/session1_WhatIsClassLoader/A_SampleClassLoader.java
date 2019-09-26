package Chap1.A_ClassLoader.session1_WhatIsClassLoader;

/**
 * 간단한 클래스 로더를 작성해 보자
 */
public class A_SampleClassLoader {
    public static void main(String[] args){
        // 1. ClassLoader의 인스턴스를 생성한다
        ClassLoader simpleClassLoder = new ClassLoader() {};
        try {

            // 2. ClassLoader의 loadClass 메서드를 사용하여 클래스를 다이나믹 로드 시킨다
            Class<?> modelClass
                        = simpleClassLoder.loadClass("Chap1.A_ClassLoader.session1_WhatIsClassLoader.ShowModel");
            // 3. ClassLoader로 로드 된 클레스를 참조 링크한다
            ShowModel modelInstance = (ShowModel)modelClass.newInstance();
            modelInstance.show();
        }catch (ClassNotFoundException classNotFound){
            // loadClass 메서드 실행 시 ClassNotFoundException 오류를 발생 시킬 수 있다. 오류는 한번씩만 짚고 가겠다
            classNotFound.printStackTrace();
        }catch (IllegalAccessException illegalAccess){
            // newInstance 메서드 실행 시 IllegalAccessException 오류를 발생 시킬 수 있다.
            illegalAccess.printStackTrace();
        }catch (InstantiationException instantException){
            // newInstance 메서드 실행 시 InstantiationException 오류를 발생 시킬 수 있다.
            instantException.printStackTrace();
        }
    }
}
class ShowModel{
    static{
        System.out.println("Show Model Ready ~ !");
    }
    public void show(){
        System.out.println("Mew ~ ");
    }
}