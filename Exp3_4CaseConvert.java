import java.util.*;

class Exp3_4CaseConvert
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);

		StringBuffer s1=new StringBuffer();

		System.out.println("Enter your string :");
		s1.append(in.next());
		int n=s1.length();

		char[] arr=new char[n];

		for(int i=0; i<n; i++)
		{
			arr[i]=s1.charAt(i);
			if(arr[i]>='a' && arr[i]<='z')
			{
				arr[i]=(char)((int)arr[i]-32);
			}

			System.out.print(arr[i]);
		}
	}
}
