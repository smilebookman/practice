/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylearn.socket;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Test4 {

    public static void main(String args[]) {
        try {
            char[] charArray = new char[3];
            ServerSocket serverSocket = new ServerSocket(8088);
            System.out.println("accept begin " + System.currentTimeMillis());
            Socket socket = serverSocket.accept();
            System.out.println("accept end " + System.currentTimeMillis());

            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            System.out.println("read begin " + System.currentTimeMillis());
            int readLength = inputStreamReader.read(charArray);
            while (readLength != -1) {
                String newString = new String(charArray, 0, readLength);
                System.out.println(newString);
                readLength = inputStreamReader.read(charArray);
            }
            System.out.println("read end " + System.currentTimeMillis());
            inputStreamReader.close();
            inputStream.close();
            socket.close();
            serverSocket.close();
        } catch (Exception ex) {
            Logger.getLogger(Test4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
