/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demosocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author neel
 */
public class DemoSocket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            ServerSocket ss;
        try {
            ss = new ServerSocket(3333);
            
            
            Socket s = ss.accept();
            System.out.println("Connected!");
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
        } catch (IOException ex) {
            Logger.getLogger(DemoSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
}
