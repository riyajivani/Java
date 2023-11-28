import java.io.*;
class Try 
{
	public static void main(String args[]) throws IOException
	{
		File f1=new File("File1.txt");
		File f2=new File("File2.txt");
		File f3=new File("Inshiya.txt");
		File f4=new File("hi.txt");
		f1.createNewFile();
		System.out.println("Name: "+f1.getName());
		System.out.println("path: "+f2.getAbsolutePath());
		System.out.println("Get Parent method: "+f1.getParent());
		System.out.println("getParentFile method: "+f1.getParentFile());
		System.out.println("is Absolute method: "+f1.isAbsolute());
		System.out.println("can read method :"+f1.canRead());
		System.out.println("can write method: "+f1.canWrite());
		System.out.println("exist method: "+f1.exists());
		//System.out.println("get absolute file method: "+f1.getAbsoluteFile());
		System.out.println("is directory method: "+f1.isDirectory());
		System.out.println("is file method: "+f1.isFile());
		System.out.println("is hidden: "+f1.isHidden());
		System.out.println("last modified method: "+f1.lastModified());
		System.out.println("length method: "+f1.length());
		f4.createNewFile();
		System.out.println("mkdir method: "+f1.mkdir());
		System.out.println("mkdirs method: "+f1.mkdirs());
		//System.out.println("rename to method: "+f4.renameTo(f3));
		System.out.println("set read only method: "+f1.setReadOnly());
		System.out.println("set writable : "+f1.setWritable(true));
		System.out.println("set executable: "+f1.setExecutable(true));
		System.out.println("compare to method: "+f1.compareTo(f2));
		System.out.println("equals method: "+f1.equals(f2));
		//System.out.println("delete method: "+f4.delete());
	}
}