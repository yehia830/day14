package com.tiy.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
public class MyConnectionTamer implements Runnable {
    Socket connect;

    public MyConnectionTamer(Socket connect){
        this.connect = connect;
    }
    public MyConnectionTamer(){

    }
    public void run() {
        try {
          tameNewConnection(connect);
        } catch (IOException exio) {
            exio.printStackTrace();
        }
    }
    public void tameNewConnection(Socket connect) throws IOException{
        System.out.println("Connection greeted with open arms!");

        System.out.println("clientSocket" + connect);

        System.out.println("New Hacker Alert!!! : " + connect.getInetAddress().getHostAddress());


        BufferedReader inputFromClient = new BufferedReader(new InputStreamReader(connect.getInputStream()));

        PrintWriter outputToClient = new PrintWriter(connect.getOutputStream(), true);

        String hackerMessage;

        while((hackerMessage = inputFromClient.readLine()) != null){
            System.out.println("This is what I read : " + hackerMessage + " from " + hackerMessage.toString());
            outputToClient.println("NOOOOOO");
        }
        try{Thread.sleep(10000); } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
