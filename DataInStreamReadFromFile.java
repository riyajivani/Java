import java.io.*;

class  DataInStreamReadFromFile
{
	public static void main(String [] args) throws IOException
	{
			File f = new File("D:\\sem-3\\java\\book\\f2.txt");
			
			DataInputStream dis = new DataInputStream(new FileInputStream(f));
			
			System.out.print(dis.readInt());
	}
}
