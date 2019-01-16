/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylearn.socket;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Client5 {

    public static void main(String args[]) {
        try {
            System.out.println("client 连接准备 " + System.currentTimeMillis());
            Socket socket = new Socket("127.0.0.1", 6666);
            System.out.println("client 连接结束 " + System.currentTimeMillis());

            char[] charArray = new char[3];
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            
            System.out.println();
            int readLength = inputStreamReader.read(charArray);
            
        } catch (Exception ex) {
            Logger.getLogger(Client5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
