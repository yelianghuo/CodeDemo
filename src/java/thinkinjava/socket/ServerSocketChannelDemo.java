package thinkinjava.socket;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerSocketChannelDemo {
    public static void main(String[] args) throws Exception {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(new InetSocketAddress( 3333));
        SocketChannel socketChannel = serverSocketChannel.accept();
        System.out.println("remote address: " + socketChannel.getRemoteAddress());
        System.out.println("local address: "+socketChannel.getLocalAddress());
        ByteBuffer writebuffer = ByteBuffer.allocate(128);
        writebuffer.put("hello WebClient this is from WebServer".getBytes());
        writebuffer.flip();
        socketChannel.write(writebuffer);

        ByteBuffer readBuffer = ByteBuffer.allocate(128);
        socketChannel.read(readBuffer);
        StringBuilder stringBuilder = new StringBuilder();
        readBuffer.flip();
        while (readBuffer.hasRemaining()) {
            stringBuilder.append((char)readBuffer.get());
        }
        System.out.println("从客户端接收到的数据：" + stringBuilder.toString());
        socketChannel.close();
        serverSocketChannel.getClass();

    }
}
