package thinkinjava.socket;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class SocketChannelDemo {
    public static void main(String[] args) throws Exception {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("localhost",8000));
        ByteBuffer writeBuffer = ByteBuffer.allocate(128);
        writeBuffer.put("hello WebServer this is from WebClient".getBytes());
        writeBuffer.flip();
        socketChannel.write(writeBuffer);

        ByteBuffer readBuffer = ByteBuffer.allocate(128);
        socketChannel.read(readBuffer);

        StringBuilder stringBuilder = new StringBuilder();
        readBuffer.flip();
        while(readBuffer.hasRemaining()) {
            stringBuilder.append((char)readBuffer.get());
        }

        System.out.println("receive data: " + stringBuilder.toString());
        socketChannel.close();
    }
}
