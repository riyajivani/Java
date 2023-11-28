import java.io.*;

class CalculatorInFile
{
		public static void main(String [] args) throws IOException
		{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("Enter two numbers:");
				int a=Integer.parseInt(br.readLine());
				int b=Integer.parseInt(br.readLine());
				
				System.out.println("Enter operator(+ - * /):");
				char c=(br.readLine()).charAt(0);
				
				switch(c)
				{
					case '+':
					{
						int ans=a+b;
						System.out.println("sum is:"+ans);
						break;
					}
					case '-':
					{
						int ans=a-b;
						System.out.println("subtraction is:"+ans);
						break;
					}
					case '*':
					{
						int ans=a*b;
						System.out.println("multiplication is:"+ans);
						break;
					}
					case '/':
					{
						int ans=a/b;
						System.out.println("devision is:"+ans);
						break;
					}
					default:
					{
						System.out.println("oprator can't be match");
					}
				}
		}
}