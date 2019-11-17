package com.company;
import java.io.*;
import java.net.*;

public class Client {

    public static void main(String argv[]) throws Exception {
        Socket clientSocket;
        clientSocket = new Socket("localhost", 9300);
        try {
            while (true){
                System.out.println("Server connection is sucessful");
                BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
                DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
                DataOutputStream out = new DataOutputStream(outToServer);

                out.writeUTF(inFromUser.readLine());
                byte[] bytes = new byte[1024];
                DataInputStream in = new DataInputStream(clientSocket.getInputStream());
                int read = in.read(bytes);

                System.out.println("Server response: " + new String(bytes, 2, read -2));
                //clientSocket.close();
            }
        }catch (ConnectException e ){
            System.out.println("Server do not response");
        }catch (SocketException e ) {
            System.out.println("se");
        }
    }
}
