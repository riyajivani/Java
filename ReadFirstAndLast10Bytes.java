import java.io.*;

class ReadFirstAndLast10Bytes
{
	public static void main(String [] args) throws IOException
	{
			
		FileInputStream f = new FileInputStream(args[0]);
		
		int size;
		size=f.available();
			
		for(int i=0; i<10; i++)
		{
			System.out.print((char)f.read());
		}
		
		f.skip(size-20);
			
		for(int i=0; i<10; i++)
		{
		System.out.print((char)f.read());
		}
	}
}
