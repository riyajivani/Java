
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocketServerDemo {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(3333);
            Socket s = ss.accept();
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    DataInputStream din = null;
                    try {
                        din = new DataInputStream(s.getInputStream());
                        while (true)
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
                        while (true) {
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
