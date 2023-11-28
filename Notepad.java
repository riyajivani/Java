package book;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class Notepad extends Frame implements ActionListener {
    File f;
    TextField t1 = new TextField();
    TextArea t =new TextArea();
    MenuBar b = new MenuBar();
    Menu m = new Menu("file");
    MenuItem m1 = new MenuItem("new");
    MenuItem m2  =new MenuItem("copy");
    MenuItem m3 =new MenuItem("paste");
    MenuItem m4 = new MenuItem("delete");

    Notepad(){
        setSize(500,500);
        setVisible(true);
        setLayout(new BorderLayout());
        setMenuBar(b);
        b.add(m);
        m.add(m1);
        m.add(m2);
        m.add(m3);
        m.add(m4);
        add(t1, BorderLayout.NORTH);
        add(t, BorderLayout.CENTER);


        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String fname = t1.getText();
        String fpath = "D:\\sem-3\\java\\book" + fname;
        f = new File(fpath);
        if (e.getSource() == m1) {
            try {


                if (!f.exists()) {
                    f.createNewFile();
                }

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        if (e.getSource() == m2) {
            String s = t.getText();

            try {
                FileWriter fw = new FileWriter(f);
                fw.write(s);
                fw.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        if (e.getSource() == m4) {
            f.delete();
        }
        if (e.getSource() == m3) {
            try {
                StringBuilder str = new StringBuilder();
                Scanner sc = new Scanner(f);

                while (sc.hasNextLine()){
                    str.append(sc.nextLine());
                }
                sc.close();
                t.setText(str.toString());


            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    public static void main(String[] args) {
        Notepad n  =new Notepad();
    }
}