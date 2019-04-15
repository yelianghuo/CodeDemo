package thinkinjava.socket;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo {
    public static void main(String[] args) throws Exception{
        RandomAccessFile randomAccessFile = new RandomAccessFile("test.txt", "rw");
        FileChannel inChannel = randomAccessFile.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(48);
        int bytesRead = inChannel.read(buffer);
        System.out.println(bytesRead);
        ByteBuffer buffer2 = ByteBuffer.allocate(48);
        buffer2.put("filechannel test".getBytes());
        buffer2.flip();
        inChannel.write(buffer2);
        while (bytesRead != -1) {
            System.out.println("read: " + bytesRead);
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char)buffer.get());
            }
            buffer.clear();
            bytesRead = inChannel.read(buffer);
        }
        randomAccessFile.close();

    }
}
