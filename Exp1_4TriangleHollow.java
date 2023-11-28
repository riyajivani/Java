class Exp1_4TriangleHollow
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);

		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<=(n+n-1);j++)
			{
				if(i==0 && j==(n-1))
					System.out.print("*");

				else if(j==(n-i-1) || j==(n+i-1))
					System.out.print("*");

				else
					System.out.print(" ");
			}
		System.out.print("\n");
		}
		
		for(int i=0; i<(n+n-1); i++)
		{
			System.out.print("*");
		}
	}
}