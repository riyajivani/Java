import java.io.*;

class AsciivalueOfFirst10
{
	public static void main(String []args) throws IOException
	{
			File f1=new File(args[0]);
			
			FileInputStream fis=new FileInputStream(f1);
			PrintWriter pw = new PrintWriter(new FileOutputStream("D:\\sem-3\\java\\book\\f2.txt"));
			
			for(int i=0; i<10; i++)
			{
				pw.print(fis.read()+" ");
			}
			pw.close();
	}
}