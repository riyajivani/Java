import java.io.*;

class RandomAccessFileEx
{
		public static void main(String [] args) throws IOException
		{
			RandomAccessFile rf = new RandomAccessFile("D:\\sem-3\\java\\book\\ForFiles\\f3.txt","rw");
			
			rf.seek(5);
			rf.writeChar('W');
			rf.skipBytes(5);
			rf.writeChar('H');
		}
}