/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylearn.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Test3 {

    public static void main(String args[]) {
        byte[] byteArray = new byte[1024];
        try {
            ServerSocket serverSocket = new ServerSocket(8088);
            System.out.println("accept begin " + System.currentTimeMillis());
            Socket socket = serverSocket.accept();
            System.out.println("accept end " + System.currentTimeMillis());
            InputStream inputStream = socket.getInputStream();
            System.out.println("read begin " + System.currentTimeMillis());
            int readLength = inputStream.read(byteArray);
            System.out.println("read end " + System.currentTimeMillis());
            inputStream.close();
            socket.close();
            serverSocket.close();
        } catch (Exception ex) {
            Logger.getLogger(Test3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
