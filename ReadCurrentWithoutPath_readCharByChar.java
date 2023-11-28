import java.io.*;

class ReadCurrentWithoutPath_readCharByChar
{
	public static void main(String [] args) throws IOException
	{
			FileInputStream f = new FileInputStream(args[0]);
			
			int size;
			size=f.available();
			
			for(int i=0; i<size; i++)
			{
				System.out.print((char)f.read());
			}
	}
}