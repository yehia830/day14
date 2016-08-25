package com.tiy.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Yehia830 on 8/25/16.
 */
public class sampleServer implements Runnable {
    Socket clientSocket = null;

   public sampleServer(Socket clientSocket){
       this.clientSocket = clientSocket;
   }
   public void run(){



   }
   public sampleServer(){

   }




    public void startServer() {

        try {
            System.out.println("starting server");
            ServerSocket serverListener = new ServerSocket(8080);
            System.out.println("Listener ready...");

            while (true) {
                Socket incomingConnection = serverListener.accept();
                ConnectionHandler handler = new ConnectionHandler(incomingConnection);
                Thread handlerThread = new Thread(handler);
                handlerThread.start();
            }





        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }


}

