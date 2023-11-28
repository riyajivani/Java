//Reading from a file

//(1) using bufferreader class

/*import java.io.*;

class ReadFiles
{
	public static void main(String [] args) throws IOException
	{
		File f = new File("D:\\sem-3\\java\\book\\ForFiles\\f2.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String st;
		
		while((st=br.readLine())!=null)
		{
			System.out.println(st);
		}
	}
}*/

//(2) using FileReader class

/*import java.io.*;

class ReadFiles
{
	public static void main(String [] args) throws IOException
	{
		//File f = new File("D:\\sem-3\\java\\book\\ForFiles\\f2.txt");
		
		FileReader fr = new FileReader("D:\\sem-3\\java\\book\\ForFiles\\f2.txt");
		
		 int content;
            while ((content = fr.read()) != -1) {
                System.out.print((char) content);
			}
	}
}*/

//(3) using Scanner class

import java.io.*;
import java.util.*;

class ReadFiles
{
	public static void main(String [] args) throws IOException
	{
		File f = new File("D:\\sem-3\\java\\book\\f2.txt");
		
		Scanner s = new Scanner(f);
		
		StringBuffer sb = new StringBuffer();
      
		while(s.hasNext()) {    //while(s.hasNextLine())
			sb.append(" "+s.nextLine());  //sop(s.nextLine());
		}
		System.out.println(sb);
	}
}