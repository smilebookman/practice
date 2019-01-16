/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylearn.nio;

import java.nio.ByteBuffer;

/**
 *
 * @author Administrator
 */
public class CursorLearn {

    public static void main(String args[]) {
        byte[] b = new byte[]{1, 2, 3, 4, 5, 6};
        ByteBuffer buffer = ByteBuffer.wrap(b);
        System.out.println("capacity: " + buffer.capacity());
        System.out.println(buffer.isDirect());
        for (int i = 0; i < buffer.capacity(); i++) {
            System.out.print("取出第 " + String.valueOf(i + 1) + " 个元素：");
            System.out.println("当前position: " + buffer.position());
            System.out.println(buffer.get(i));
        }
    }
    
    
}
