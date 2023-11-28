import java.io.*;

class file 
{
	public static void main(String [] args)
	{
		File f1=new File("C:\\ForFiles\\f1.txt");
		File f2=new File("D:\\sem-3\\java\\book\\ForFiles\\f2.txt");
		File f3=new File("f3.txt");

		System.out.println(f1.getAbsolutePath());
		System.out.println(f2.getAbsolutePath());
		System.out.println(f3.getAbsolutePath());

		System.out.println(f2.getParent());
		System.out.println(f3.exists());
		f1.setReadOnly();

		System.out.println(f2.isDirectory());
		System.out.println(f3.canWrite());
		System.out.println(f2.lastModified());

		System.out.println("f1:"+f1.length());
		System.out.println("f2:"+f2.length());
		System.out.println("f3:"+f3.length());
	}
}