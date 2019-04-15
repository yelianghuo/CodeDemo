package thinkinjava.disposeFile;

import java.io.File;
import java.net.URL;
import java.util.Enumeration;

public class ClassLoadFile {
    public static void main(String[] args) throws Exception{

        System.out.println(ClassLoadFile.class.getClassLoader());
        Enumeration<URL> urls = ClassLoadFile.class.getClassLoader().getResources("jvm");
        while (urls.hasMoreElements()) {
            URL url= urls.nextElement();
            String urlPath = url.getPath();
            File file = new File(urlPath);
            System.out.println(file);
        }
    }
}
