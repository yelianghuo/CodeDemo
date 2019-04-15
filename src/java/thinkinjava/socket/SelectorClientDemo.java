package thinkinjava.socket;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class SelectorClientDemo {
    public static void main(String[] args) {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.connect(new InetSocketAddress("localhost", 8000));
            ByteBuffer readBuffer = ByteBuffer.allocate(32);
            ByteBuffer writeBuffer = ByteBuffer.allocate(32);
            writeBuffer.put("hello".getBytes());
            writeBuffer.flip();
            while (true) {
                writeBuffer.rewind();
                socketChannel.write(writeBuffer);
                readBuffer.clear();
                socketChannel.read(readBuffer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
