/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tcp_client;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import utility.FileUtility;

/**
 *
 * @author HP
 */
public class TCPClient {

    public static void main(String[] args)throws Exception{
        
       Socket socket=new Socket("localhost",6790);
       OutputStream outputStream =socket.getOutputStream();
        DataOutputStream dataOutputStream=new DataOutputStream(outputStream);
        byte[] bytes=FileUtility.readBytes("/Users/HP/Desktop/photo/deer.ps.png");
        dataOutputStream.writeInt(bytes.length); 
        dataOutputStream.write(bytes);
        socket.close();
    }
} 
