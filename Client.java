/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demosocket;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author neel
 */
public class Client {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("127.0.0.1", 3333);
            System.out.println("Server Found");
            
            new Thread(
                    new Runnable() {
                @Override
                public void run() {
                    DataOutputStream dout = null;
                    try {
                        dout = new DataOutputStream(s.getOutputStream());
                        do{
                        Scanner sc = new Scanner(System.in);
                        dout.writeUTF(sc.nextLine());
                        }while(true);
                    } catch (IOException ex) {
                        Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
               }
            ).start();
            
            new Thread(
                    new Runnable() {
                @Override
                public void run() {
                    DataOutputStream dout = null;
                    try {
                        DataInputStream din = new DataInputStream(s.getInputStream());
                        do{
                        System.out.println(din.readUTF());
                        }while(true);
                    } catch (IOException ex) {
                        Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
               }
            ).start();
            
        }catch(IOException ie){}
    }
}
