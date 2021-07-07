import java.io.*;
public class SequenceInput2{
public static void main(String[]args)throws Exception{

	//To access or to display the text file
	FileInputStream ip1 = new FileInputStream("File2.txt");
	FileInputStream ip2 = new FileInputStream("File3.txt");

	//To add the text file contents to the new file
	FileOutputStream op = new FileOutputStream("File4.txt");
	
	SequenceInputStream sis = new SequenceInputStream(ip1, ip2);
	
	int j;
	while((j=sis.read())!=-1){
		op.write(j);
	}
	
	sis.close();
	ip2.close();
	ip1.close();
	op.close();
	
	System.out.println("Done");
	}
	}