package thinkinjava.string;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.Iterator;
import java.util.Set;

public class CharsetTest {
    public static void main(String[] args) throws Exception {
        Charset charset = Charset.forName("utf8");
        System.out.println(charset.name()+" * * "+charset.canEncode());
        //返回一个包含该字符的别名，字符集的别名是不可变的
        Set<String> set = charset.aliases();
        System.out.println(set);
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("----------编码----------------");
        ByteBuffer buffer = charset.encode("sdf");

        CharsetDecoder decoder = charset.newDecoder();
        System.out.println(buffer);
        System.out.println("before 缓冲区剩余的元素数--"+buffer.remaining());
        CharBuffer charbuffer = decoder.decode(buffer);
        System.out.println("after 缓冲区剩余的元素数--"+buffer.remaining());
        System.out.println(charbuffer + "-----");


        System.out.println(charbuffer.get(0)+ "___");

        System.out.println("缓冲区剩余的元素数--"+buffer.remaining());
        while(buffer.hasRemaining()) {
            System.out.println((char)buffer.get());
        }
        System.out.println("缓冲区剩余的元素数--"+buffer.remaining());
        System.out.println("----------解码----------------");
        //清空缓冲区，将限制设置恢复，如果定义了标记，则将它们丢弃
        buffer.flip();

    }

    void execute() {
        String s= "hello ni 好";
        byte[] bytes = s.getBytes();
        System.out.println(bytes.length);
    }

}
