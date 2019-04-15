package thinkinjava.socket;

import java.nio.ByteBuffer;

public class ByteBufferDemo {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(48);
        byteBuffer.clear();
        byteBuffer.position(5);
        //byteBuffer.mark();
        System.out.println(byteBuffer);
        byteBuffer.mark();
        byteBuffer.position(10);
        System.out.println(byteBuffer);
        byteBuffer.reset();
        System.out.println(byteBuffer);
        byteBuffer.limit(15);
        System.out.println(byteBuffer );
        //byteBuffer.clear();
        //byteBuffer.flip();
        //System.out.println(byteBuffer);
        byteBuffer.rewind();
        System.out.println(byteBuffer);
        System.out.println("-------------Test compact-------------");
        byteBuffer.clear();
        byteBuffer.put("abcd".getBytes());
        System.out.println(byteBuffer);
        //System.out.println(new String(byteBuffer.array()));
        byteBuffer.flip();
        System.out.println(byteBuffer);
        System.out.println((char) byteBuffer.get());
        System.out.println(byteBuffer);
        // 将position->limit之间的数据整体移动到0开始的位置
        System.out.println("-------before compact------");
        byteBuffer.compact();
        System.out.println(byteBuffer);
//        byteBuffer.flip();
        byteBuffer.put("e".getBytes());
        System.out.println(byteBuffer);

        // get(index)不影响position的值
        System.out.println((char)byteBuffer.get(0));
        System.out.println((char)byteBuffer.get(1));
        System.out.println((char)byteBuffer.get(3));
        System.out.println(byteBuffer);

        //byteBuffer.flip();

        byte[] byt = new byte[10];
        byteBuffer.get(byt, 0, 2);
        System.out.println(new String(byt));
        System.out.println(byteBuffer);
        System.out.println((char)byteBuffer.get());
        System.out.println((char)byteBuffer.get());
        System.out.println(byteBuffer);



    }
}
