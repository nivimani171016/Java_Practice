import java.io.*;
class InputStream1{
public static void main(String[]args){
	try{
		
		//Object for the InputStream Class
		FileInputStream ip = new FileInputStream("File2.txt");
		
		//To read (i.e.display) the content in the file in the iny format
		//Converting int to char by type conversion
		//Prints just single char
		int i = ip.read();
		System.out.println(i);
		System.out.println((char)i);
		
		//Prints the estimated number of bytes available 		
		int j = ip.available();
		System.out.println(j);
		
		//To print the entire content
		int n=0;
		while((n=ip.read())!=-1)
		{
		System.out.print((char)n);
		}
		
		ip.close();
	}catch(Exception e){
	System.out.println(e);
	}
	System.out.println("\nReading the string is completed");
}
}
		