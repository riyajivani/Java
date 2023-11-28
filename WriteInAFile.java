import java.io.*;

class WriteInAFile
{
	public static void main(String [] args) throws IOException
	{		
		File f = new File("D:\\sem-3\\java\\book\\f2.txt");
		
		FileWriter fw = new FileWriter(f);
		
		String s=new String("HELLO WORLD");
		
		int i=s.length();
		int k=0;
		
		while(k!=i)
		{
			char c = s.charAt(k);
			fw.write(c);
			k++;
		}
		fw.close();
	}
}




