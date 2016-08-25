package com.tiy.networking;

/**
 * Created by Yehia830 on 8/25/16.
 */
public class day14Runner {
    public static void main(String[] args) {
        System.out.println("running");
        sampleServer sampleServer = new sampleServer();
        ConnectionHandler connectionHandler = new ConnectionHandler();
        sampleServer.startServer();
        connectionHandler.run();

    }
}
