import java.io.*;

class AdditionOfNumbersOfFile
{
	public static void main(String [] args) throws IOException
	{
		double total=0.0;
		
		File f = new File("D:\\sem-3\\java\\book\\f1.txt");
		
		FileReader fr = new FileReader(f);
		
		StreamTokenizer st = new StreamTokenizer(fr);
		
		while(st.nextToken()!=st.TT_EOF)
		{
			if(st.ttype==st.TT_NUMBER)
			{
				total=total+st.nval;
			}
			else
			{
				System.out.println("not number.");
			}
		}
		
		System.out.println("total is: "+total);
	}
}