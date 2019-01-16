/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylearn.channel;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class TestLock {

    public static void main(String args[]) {
        try {
            RandomAccessFile file = new RandomAccessFile("C:\\Users\\Administrator\\Desktop\\nioTest.txt", "rw");
            FileChannel filechannel = file.getChannel();
            filechannel.lock(2, 3, true);
            filechannel.position(4);
            filechannel.write(ByteBuffer.wrap("1".getBytes()));
        } catch (Exception ex) {
            Logger.getLogger(TestLock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
