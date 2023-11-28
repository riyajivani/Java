import java.util.*;

interface istack1
{
	public void push(int a);
}

interface istack2
{
	public void pop();
}

class Exp4_4Interface implements istack1,istack2
{
	int[] jour=new int[5];
	static int top=-1;

	Exp4_4Interface()
	{
		for(int i=0; i<5; i++)
		{
			jour[i]=0;
		}
	}

	public void push(int ele)
	{
		if(top==4)
			System.out.println("FULL!!");
		else
		{
			top++;
			jour[top]=ele;
		}
	}

	public void pop()
	{
		if(top<0)
			System.out.println("EMPTY!!");
		else
		{
			top--;
		}
	}

	void print()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println(jour[i]+" ");	
		}
		System.out.println("\n");	
	}

	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		
		Exp4_4Interface s=new Exp4_4Interface();
		int a;

		System.out.println("Enter elements.");

		for(int i=0; i<6; i++)
		{
			a=in.nextInt();
			s.push(a);
		}

		s.print();

		System.out.println("Delete elements.");

		for(int i=0; i<6; i++)
		{
			s.pop();
		}
	}
}

















