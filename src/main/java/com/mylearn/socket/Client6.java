/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylearn.socket;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Client6 {

    public static void main(String args[]) {
        try {
            File file = new File("C:\\Users\\Administrator\\Desktop\\test.gif");
            if (!file.exists()) {
                //先得到文件的上级目录，并创建上级目录，在创建文件
                file.getParentFile().mkdir();
                try {
                    //创建文件
                    file.createNewFile();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Socket socket = new Socket("192.168.1.111", 6666);
            InputStream in = socket.getInputStream();
            FileOutputStream fos = new FileOutputStream(file);
            byte[] byteArray = new byte[2048];
            int len = 0;
            while ((len = in.read(byteArray)) != -1) {
                fos.write(byteArray, 0, len);
            }

            fos.close();
            in.close();
            socket.close();
        } catch (Exception ex) {
            Logger.getLogger(Client6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
