package thinkinjava.javaio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) {
        System.out.println(new File(".").getAbsolutePath());
        System.out.println(System.getProperty("user.dir"));
        System.out.println(CopyBytes.class.getName());
        File file = new File("test.txt");
        System.out.println(file.exists());

        try (

                FileInputStream in= new FileInputStream(file);
                FileOutputStream out= new FileOutputStream("out.txt");
                ){
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }
}
