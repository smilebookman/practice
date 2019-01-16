/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylearn.network;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Test1 {

    public static void main(String args[]) {
        try {
            Enumeration<NetworkInterface> networkinterface = NetworkInterface.getNetworkInterfaces();
            while (networkinterface.hasMoreElements()) {
                NetworkInterface eachnetworkinterface = networkinterface.nextElement();
                System.out.println(" 【getName】获得网络设备名称 = " + eachnetworkinterface.getName());
                System.out.println(" 【getDisplayName】获得网络设备显示名称 = " + eachnetworkinterface.getDisplayName());
                System.out.println(" 【getIndex】获得网络接口的索引 = " + eachnetworkinterface.getIndex());
                System.out.println(" 【isUp】是否已经开启并运行 = " + eachnetworkinterface.isUp());
                System.out.println(" 【isLoopback】是否为回调接口 = " + eachnetworkinterface.isLoopback());
                System.out.println(" 【getMTU】获得最大传输单元 = " + eachnetworkinterface.getMTU());
                System.out.println("【isPointToPoint】是不是点对点设备 = " + eachnetworkinterface.isPointToPoint());
                System.out.println("【supportsMulticast】是否支持多地址广播 = " + eachnetworkinterface.supportsMulticast());
                System.out.print(" 【getHardwareAddress】获得网卡的物理地址 = ");
                byte[] array = eachnetworkinterface.getHardwareAddress();
                if (null != array && array.length != 0) {
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                    }
                }
                System.out.println();
                System.out.print(" 【getInetAddresses】获得网络接口的InetAddress信息 = ");
                Enumeration<InetAddress> enumInetAddress = eachnetworkinterface.getInetAddresses();
                while (enumInetAddress.hasMoreElements()) {
                    InetAddress inetAddress = enumInetAddress.nextElement();
                    System.out.println("【getCanonicalHostName】获取此IP地址的完全限定域名 = " + inetAddress.getCanonicalHostName());
                    System.out.println("【getHostName】获取此IP地址的主机名 = " + inetAddress.getHostName());
                    System.out.println("【getHostAddress】获取此IP地址字符串 = " + inetAddress.getHostAddress());
                    System.out.print("【getAddress】返回此InetAddress对象原始IP地址 = ");
                    byte[] addressByte = inetAddress.getAddress();
                    for (int i = 0; i < addressByte.length; i++) {
                        System.out.print(addressByte[i] + " ");
                    }
                }
                System.out.println();
                System.out.println();
                System.out.println();
            }
        } catch (Exception ex) {
            Logger.getLogger(Test1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
