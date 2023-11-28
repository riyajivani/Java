import java.io.*;

class Bufferreader
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter roll no.");
		int a=Integer.parseInt(br.readLine());
		
		System.out.println("enter name");
		String s=br.readLine();
		
		System.out.println("roll no. :"+a);
		System.out.println("name: "+s);
	}
}