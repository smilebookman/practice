/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylearn.socket;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Client {

    public static void main(String args[]) {
        try {
            System.out.println("client 连接准备 = " + System.currentTimeMillis());
            Socket socket = new Socket("127.0.0.1", 8088);
            System.out.println("client 连接结束 = " + System.currentTimeMillis());
            socket.close();
        } catch (Exception ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
