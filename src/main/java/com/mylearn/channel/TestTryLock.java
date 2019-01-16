/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylearn.channel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class TestTryLock {

    public static void main(String args[]) {
        try {
            RandomAccessFile file = new RandomAccessFile("C:\\Users\\Administrator\\Desktop\\nioTest.txt", "rw");
            FileChannel filechannel = file.getChannel();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestTryLock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
