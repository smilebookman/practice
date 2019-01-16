/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylearn.channel;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Test2_1 extends Thread {
    
    @Override
    public void run(){
        try {
            RandomAccessFile file1 = new RandomAccessFile("C:\\Users\\Administrator\\Desktop\\nioTest.txt", "rw");
            FileChannel filechannel1 = file1.getChannel();
            System.out.println("Thread1 begin：");
            filechannel1.lock(1, 2, false);
            System.out.println("Thread1 end！");
            Thread.sleep(Integer.MAX_VALUE);
            file1.close();
            filechannel1.close();
        } catch (Exception ex) {
            Logger.getLogger(Test2_1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]){
        Thread t = new Test2_1();
        t.start();
    }

}
