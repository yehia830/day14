package com.tiy.networking;

/**
 * Created by Yehia830 on 8/25/16.
 */
public class Day14HomeWorkRunner {
    public static void main(String[] args) {
        System.out.println("Running...");
        MyServer myServer = new MyServer();
        MyConnectionTamer connectionTamer = new MyConnectionTamer();
        myServer.beginServer();
        connectionTamer.run();
    }
}
