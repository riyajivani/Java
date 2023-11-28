import java.util.*;

class Exp3_3EmailValidation
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);

		String s=new String();

		System.out.println("Enter your email id:");
		s=in.nextLine();

		int n=s.length();

		char[] arr = s.toCharArray();

		int z=0;

		for(int i=0; i<n; i++)
		{
			if(arr[i]=='@')
			{
				for(int j=i+1; j<n; j++)
				{
					if(arr[j]=='.')
					{
						for(int k=0; k<n; k++)
						{
							if((arr[k]>='a' && arr[k]<='z') || (arr[k]>='0' && arr[k]<='9') || arr[k]=='@' || arr[k]=='.')
							z++;
						}
					}
				}
			}
		}

		if(z==n)
		{
			System.out.println("Valid email adress.");

			System.out.print("email id: ");
		
			int i=0;
			while(arr[i]!='@')
			{
				System.out.print(arr[i]);
				i++;
			}

			System.out.print("\nemail server adress: ");

			for(int j=0; j<n; j++)
			{
				if(arr[j]=='@')
				{
					for(int k=j+1; k<n; k++)
						System.out.print(arr[k]);
				}
			}
			System.out.print("\n");
		}	
		else
			System.out.println("Invalid email adress.");

			
	}
}