/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylearn.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Server5 {

    public static void main(String args[]) {
        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            System.out.println("server 阻塞开始 " + System.currentTimeMillis());
            Socket socket = serverSocket.accept();
            System.out.println("server 阻塞结束 " + System.currentTimeMillis());

            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("你好,我是服务端".getBytes());
            outputStream.close();
            socket.close();
            serverSocket.close();
        } catch (Exception ex) {
            Logger.getLogger(Server5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
