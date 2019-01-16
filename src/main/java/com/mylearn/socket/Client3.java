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
public class Client3 {
    
    public static void main(String args[]){
        try {
            System.out.println("socket begin " + System.currentTimeMillis());
            Socket socket = new Socket("127.0.0.1", 8088);
            System.out.println("socket end " + System.currentTimeMillis());
            Thread.sleep(Integer.MAX_VALUE);
            socket.close();
        } catch (Exception ex) {
            Logger.getLogger(Client3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
