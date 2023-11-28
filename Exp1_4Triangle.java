class Exp1_4Triangle
{
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);

		for(int i=0; i<n; i++)
		{
			for(int k=n; k>=i; k--)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
		System.out.print("\n");
		}	
	}
}