package com.company;
import java.io.*;
import java.net.*;


public class Server {
    public static void main(String argv[]) throws Exception {

        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress("localhost", 9300));

        Socket server = serverSocket.accept();

        while (true) {
            byte[] bytes = new byte [1024];
            DataInputStream in = new DataInputStream(server.getInputStream());
            System.out.println(in.read(bytes));

            DataOutputStream out = new DataOutputStream(server.getOutputStream());
           // out.writeUTF("Hello Client");
            out.write(bytes);
            //server.close();
        }
    }
}
