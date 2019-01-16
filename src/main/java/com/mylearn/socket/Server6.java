/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylearn.socket;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Server6 {

    public static void main(String args[]) {
        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            Socket socket = serverSocket.accept();

            InputStream inputStream = socket.getInputStream();

            FileInputStream fis = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\QQ图片20181124144739.gif"));
            OutputStream out = socket.getOutputStream();
            byte[] byteArray = new byte[2048];
            int len = 0;
            while ((len = fis.read(byteArray)) != -1) {
                out.write(byteArray, 0, len);
            }
            socket.shutdownOutput();
            fis.close();
            inputStream.close();
            socket.close();
            serverSocket.close();
        } catch (IOException ex) {
            Logger.getLogger(Server6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
