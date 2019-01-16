/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylearn.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Test2 {

    public static void main(String args[]) {
        try {
            ServerSocket socket = new ServerSocket(8088);
            System.out.println("server 阻塞开始 = " + System.currentTimeMillis());
            socket.accept();
            System.err.println("server 阻塞结束 = " + System.currentTimeMillis());
            socket.close();
        } catch (Exception ex) {
            Logger.getLogger(Test2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
