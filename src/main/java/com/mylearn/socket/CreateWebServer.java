/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylearn.socket;

import java.io.BufferedReader;
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
public class CreateWebServer {

    public static void main(String args[]) {
        try {
            ServerSocket serversocket = new ServerSocket(6666);
            Socket socket = serversocket.accept();
            InputStream inputstream = socket.getInputStream();
            InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
            BufferedReader bufferedReader = new BufferedReader(inputstreamreader);
        } catch (Exception ex) {
            Logger.getLogger(CreateWebServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
