class Exp1_4RotateTriangleHollow
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);

		for(int i=0; i<n; i++)
		{
			for(int j=0; j<(n+n-1); j++)
			{
				if(j==(n-1) || j==(n-i-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
		System.out.print("\n");
		}
		
		for(int i=1; i<n; i++)
		{
			for(int j=0; j<(n+n-1); j++)
			{
				if(j==(n-1) || j==i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		System.out.print("\n");
		}
	}
}