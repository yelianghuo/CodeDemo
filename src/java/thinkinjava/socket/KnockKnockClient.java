package thinkinjava.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class KnockKnockClient {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.err.println("Usage: java KnockKnockClient <host name> <port number>");
            System.exit(1);
        }

        String hostName = args[0];
        int portNumber = Integer.valueOf(args[1]);
        try (
                Socket kksocket = new Socket(hostName, portNumber);
                PrintWriter out = new PrintWriter(kksocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(kksocket.getInputStream()));
        ){
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            String fromServer;
            String fromUser;

            while ((fromServer = in.readLine()) != null) {
                System.out.println("Server: " + fromServer);
                if (fromServer.equals("Bye.")) {
                    break;
                }
                fromUser = stdIn.readLine();
                if(fromUser != null) {
                    System.out.println("Clinet: " + fromUser);
                    out.println(fromUser);
                }
            }

        } catch (UnknownHostException e) {
            System.err.println("Don't know about host " + hostName);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " +
                    hostName);
            System.exit(1);
        }
    }
}
