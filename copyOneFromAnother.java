import java.io.*;

 class copyOneFromAnother
 {
	 public static void main(String args[])throws IOException 
	 {
		 File file1 = new File("f1.txt"); 
		 
		 File file2 = new File("f2.txt"); 
		 
		 FileReader fr = new FileReader(file1);
		 
		 if(file2.exists()) 
		 { 
			FileWriter fw = new FileWriter(file2); 
			int i;
			while((i=fr.read())!=-1) 
			{ 
				fw.write((char)i);
			}
			fw.close();
		 }
	 }
 }