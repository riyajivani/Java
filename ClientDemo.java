/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sancy
 */
public class ClientDemo {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1", 3333);
            
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    DataInputStream din = null;
                    try {
                        din = new DataInputStream(s.getInputStream());
                        while(true)
                            System.out.println(din.readUTF());
                    } catch (IOException ex) {
                    } finally {
                        try {
                            din.close();
                        } catch (IOException ex) {
                        }
                    }
                }
            });
            
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    DataOutputStream dout = null;
                    try {
                        dout = new DataOutputStream(s.getOutputStream());
                        while(true){
                            Scanner sc = new Scanner(System.in);
                            dout.writeUTF(sc.nextLine());
                        }
                    } catch (IOException ex) {
                    } finally {
                        try {
                            dout.close();
                        } catch (IOException ex) {
                        }
                    }
                }
            });
            
            t.start();
            t1.start();
        } catch (IOException ex) {
        }
        
    }
}
