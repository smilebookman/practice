/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylearn.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Server7 {
    
    public static void main(){
        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            int runTag = 1;
            while(runTag == 1){
                Socket socket = serverSocket.accept();
            }
        } catch (IOException ex) {
            Logger.getLogger(Server7.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
