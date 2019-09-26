package Chap1.A_ClassLoader.session2_HowManyClassLoader;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.SecureClassLoader;

/**
 * SecureClassLoader 는 URLClassLoader 를 상속 하는 부모 클래스 이다.
 * 그래서 이 클래스는 URL 클래스 로더를 상속 받은 AppClassLoader 와 ExtClassLoader 가 의존할 수 있다
 */
public class E_SecureClassLoader {
    public static void main(String[] args) throws MalformedURLException ,URISyntaxException, ClassNotFoundException{
        String fileName = "Chap1.A_ClassLoader.session2_HowManyClassLoader.SampleClass1";
        URL url = new File(fileName).toURL();
        URL[] urls = {url};
        // URLClassLoader 를 통하여 SecureClassLoader 로 의존
        SecureClassLoader urlLoader = new URLClassLoader(urls);
        // AppClassLoader 를 통하여 SecureClassLoader 로 의존
        SecureClassLoader apploader = (SecureClassLoader)ClassLoader.getSystemClassLoader();
        apploader.loadClass(fileName.replace("SampleClass1","SampleClass2"));

    }
}

class SampleClasss1{

}

class SampleClass2{

}