package com.tiy.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Yehia830 on 8/25/16.
 */
public class MyClient {
    public static void main(String[] args) {
        System.out.println("running client");
        try {
            Socket clientSocket = new Socket("10.0.0.131", 8080);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            out.println("donald duck");
            String serverResponse = in.readLine();


            clientSocket.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
