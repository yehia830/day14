package com.tiy.networking;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Yehia830 on 8/25/16.
 */
public class SampleClient {
    public static void main(String[] args) {
        System.out.println("running client");
        Scanner scanner = new Scanner(System.in);
        try {


            // connect to the server on the target port
            Socket clientSocket = new Socket("localhost", 8080);

            // once we connect to the server, we also have an input and output stream
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // send the server an arbitrary message
            System.out.println("Type exit to exit.");
            System.out.println("Please enter your name");
            String userName = scanner.nextLine();
            out.println(userName);
            in.toString();



            // read what the server returns

            String serverResponse = in.readLine();

            // close the connection
            clientSocket.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }

while(true){
    scanner.nextLine();
    if(scanner.nextLine().equals("exit")){
        break;
    }
}







    }
}
