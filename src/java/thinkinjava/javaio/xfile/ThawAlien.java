package thinkinjava.javaio.xfile;

import thinkinjava.javaio.Alien;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Created by yelianghuo on 2018/7/22.
 */
public class ThawAlien {
    public static void main(String[] args) throws Exception{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("x.file"));
        Alien m = (Alien) in.readObject();

        System.out.println(m.getClass());
    }
}
