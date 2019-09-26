package Chap1.A_ClassLoader.session2_HowManyClassLoader;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * URLClassLoader 로 jar 파일을 링크 시켜 보자
 */
public class C_URLClassLoader{
    public static void main(String[] args) throws MalformedURLException , ClassNotFoundException{
        // 외부 라이브러리 파일을 로드 하여 사용 하자
        String urlJarPath = "file:"+new File("").getAbsolutePath()+"/sources/Chap1/A_ClassLoader/etc_Utill/ojdbc6.jar";
        URL[] url = {new URL(urlJarPath)};
        URLClassLoader urlClassLoader = new URLClassLoader(url);
        Class<?> OracleDriver = urlClassLoader.loadClass("oracle.jdbc.driver.OracleDriver");
        System.out.println(OracleDriver);
    }
}
