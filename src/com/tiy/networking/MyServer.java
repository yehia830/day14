package com.tiy.networking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class MyServer implements Runnable {
    Socket clientSocket = null;

    public MyServer(Socket clientSocket){

    }
    public void run() {

    }


    public MyServer(){

    }

    public void beginServer(){
        try{
            System.out.println("Server has began to serve...");
            ServerSocket socketEars = new ServerSocket(8080);
            System.out.println("Listener has began to listen...");

            while(true){
                Socket incomingConnect = socketEars.accept();
                MyConnectionTamer connectionTamer = new MyConnectionTamer(incomingConnect);
                Thread threadGuy = new Thread(connectionTamer);
                threadGuy.start();
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }



}
