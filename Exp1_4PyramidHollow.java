class Exp1_4PyramidHollow
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);

		for(int i=0; i<=n-1; i++)
		{
			for(int j=0; j<(n+n-1); j++)
			{
				if(j==(n+i-1) || j==(n-i-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
		System.out.print("\n");
		}

		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<(n+n-2); j++)
			{
				if(j==(i+1) || j==(n+n-i-3))
					System.out.print("*");
				else
					System.out.print(" ");
			}	
		System.out.print("\n");	
		}
	}
}