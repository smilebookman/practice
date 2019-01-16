/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylearn.channel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class TestMap {

    public static void main(String args[]) {
        try {
            File file = new File("C:\\Users\\Administrator\\Desktop\\nioTest.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            FileChannel filechannel = raf.getChannel();
            MappedByteBuffer buffer = filechannel.map(FileChannel.MapMode.READ_WRITE, 0, 5);

            System.out.println((char) buffer.get() + " position=" + buffer.position());
            System.out.println((char) buffer.get() + " position=" + buffer.position());
            System.out.println((char) buffer.get() + " position=" + buffer.position());
            System.out.println((char) buffer.get() + " position=" + buffer.position());
            System.out.println((char) buffer.get() + " position=" + buffer.position());

            System.out.println();

            buffer.position(0);
            buffer.put((byte) 'o');
            buffer.put((byte) 'p');
            buffer.put((byte) 'q');
            buffer.put((byte) 'r');
            buffer.put((byte) 's');
            
            filechannel.close();
            raf.close();
        } catch (Exception ex) {
            Logger.getLogger(TestMap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
