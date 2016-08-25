package com.tiy.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Yehia830 on 8/25/16.
 */
public class ConnectionHandler implements Runnable {
    Socket connection;

    public ConnectionHandler(Socket incomingConnection){
        this.connection = incomingConnection;
    }
    public ConnectionHandler(){

    }
    public void run() {
        try {
            handleIncomingConnection(connection);
        } catch (IOException exio) {
            exio.printStackTrace();
        }
    }
    private void handleIncomingConnection(Socket clientSocket) throws IOException {
        System.out.println("Connection accepted");

        System.out.println("clientSocket = " + clientSocket);

        // display information about who just connected to our server
        System.out.println("Incoming connection from " + clientSocket.getInetAddress().getHostAddress());

        // this is how we read from the client
        BufferedReader inputFromClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        // this is how we write back to the client
        PrintWriter outputToClient = new PrintWriter(clientSocket.getOutputStream(), true);


//            String inputLine = inputFromClient.readLine();
//            System.out.println(inputLine);
//            outputToClient.println("LEAVE ME ALONE");
        String inputLine;
        while ((inputLine = inputFromClient.readLine()) != null) {
            System.out.println("Received message: " + inputLine + " from " + clientSocket.toString());
            outputToClient.println("STOP ITTTT");
        }
        try{Thread.sleep(10000); } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
