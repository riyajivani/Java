//ByteArrayInputStream example

import java.io.*;

class Bytearrayinputstream
{
		public static void main(String[]args) throws IOException
		{
			File f = new File("D:\\sem-3\\java\\book\\f2.txt");
		
			BufferedReader br = new BufferedReader(new FileReader(f));
		
			String s;
			s=br.readLine();
			
			byte[] b=s.getBytes();
			
			ByteArrayInputStream bis  = new ByteArrayInputStream(b);
			
			int c;
			
			while((c=bis.read())!=-1)
			{
				System.out.print((char)c);
			}
			
			bis.reset();
			System.out.println();
			
			while((c=bis.read())!=-1)
			{
				System.out.print(Character.toUpperCase((char)c));
			}
		}
}