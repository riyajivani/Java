class Exp1_4RightAngleHollow
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);

		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<=i; j++)
			{
				if(j==0 || j==i)
				System.out.print("*");
			
				else
				System.out.print(" ");
			}
		System.out.print("\n");
		}

		for(int i=0; i<n; i++)
		{
			System.out.print("*");
		}
	}
}