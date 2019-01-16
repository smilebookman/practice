/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylearn.channel;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Test2 {

    public static void main(String args[]) {
        try {
            FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\Administrator\\Desktop\\nioTest.txt"));
            FileChannel filechannel = fos.getChannel();
            ByteBuffer buffer = ByteBuffer.wrap("abcde".getBytes());
            filechannel.write(buffer);
            fos.close();
            filechannel.close();
        } catch (Exception ex) {
            Logger.getLogger(Test2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
