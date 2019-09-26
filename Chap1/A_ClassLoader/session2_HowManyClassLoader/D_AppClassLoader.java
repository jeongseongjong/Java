package Chap1.A_ClassLoader.session2_HowManyClassLoader;

/**
 * SystemClassLoad 라고도 부르는 ApplicationCladdLoader 를 사용해 보자
 */
public class D_AppClassLoader {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        // SystemClassLoad를 사용 하여 classLoader를 불러 보자
        ClassLoader appClassLoader = ClassLoader.getSystemClassLoader();
        Class appClassLoaderClass = appClassLoader.getClass();
        System.out.println(appClassLoaderClass);

        // appClassLoader 를 사용 해 보자
       Class aggClass =  appClassLoader.loadClass("Chap1.A_ClassLoader.session2_HowManyClassLoader.D_AppClassLoader");
       D_AppClassLoader agg = (D_AppClassLoader)aggClass.newInstance();
       agg.show();
    }
    public void show(){
        System.out.println("Agg agg agg ~ ! !");
    }
}
