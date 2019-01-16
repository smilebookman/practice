/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylearn.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Client4 {

    public static void main(String args[]) {
        try {
            System.out.println("socket begin " + System.currentTimeMillis());
            Socket socket = new Socket("127.0.0.1", 8088);
            System.out.println("socket end " + System.currentTimeMillis());
            Thread.sleep(3000);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("我是外星人".getBytes());
            outputStream.close();
            socket.close();
        } catch (Exception ex) {
            Logger.getLogger(Client4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
