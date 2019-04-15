package thinkinjava.javaio;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Created by yelianghuo on 2018/7/22.
 */
public class FreezeAlien {
    public static void main(String[] args) throws Exception{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("x.file"));
        Alien a = new Alien();
        out.writeObject(a);
    }
}
