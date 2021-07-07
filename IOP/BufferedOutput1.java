import java.io.*;
public class BufferedOutput1{
public static void main(String[]args)throws Exception{
	FileOutputStream op = new FileOutputStream("File3.txt");
	BufferedOutputStream bp = new BufferedOutputStream(op);
	
	String s = "Welcome to Buffered Storage Example Learner";
	byte b[]=s.getBytes();
	
	bp.write(b);
	bp.flush(); //Step which displays the string
	bp.close();
	op.close();
	
	System.out.println("Done");
	}
}