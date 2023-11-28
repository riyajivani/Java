class Exp1_4RotateTriangle
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);

		for(int i=0; i<n; i++)
		{
			for(int k=0; k<n-i-1; k++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++)
			{
				if(i%2==0&&j%2==0)
				System.out.print("*");
	
				else if(i%2==0&&j%2!=0)
				System.out.print(" ");
			
				else if(i%2!=0&&j%2!=0)
				System.out.print(" ");

				else if(i%2!=0&&j%2==0)
				System.out.print("*");
			}
		System.out.print("\n");
		}

		for(int i=0; i<n-1; i++)
		{

			for(int k=0; k<=i; k++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<n-i-1; j++)
			{
				if(i%2==0&&j%2==0)
				System.out.print("*");

				else if(i%2==0&&j%2!=0)
				System.out.print(" ");
		
				else if(i%2!=0&&j%2==0)
				System.out.print("*");

				else if(i%2!=0&&j%2!=0)
				System.out.print(" ");
				
			}
		System.out.print("\n");
		}
	}
}