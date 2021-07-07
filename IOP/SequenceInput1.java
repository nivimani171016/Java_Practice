import java.io.*;
public class SequenceInput1{
public static void main(String[]args)throws Exception{
	FileInputStream ip1 = new FileInputStream("File2.txt");
	FileInputStream ip2 = new FileInputStream("File3.txt");
	
	SequenceInputStream sis = new SequenceInputStream(ip1, ip2);
	
	int j;
	while((j=sis.read())!=-1){
		System.out.print((char)j);
	}
	
	sis.close();
	ip2.close();
	ip1.close();
	}
	}