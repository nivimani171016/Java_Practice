import java.io.*;
public class BufferedInput1{
public static void main(String[]args){
	try{
		FileInputStream ip = new FileInputStream("File3.txt");
		BufferedInputStream bp = new BufferedInputStream(ip);
		
		int i;
		while((i=bp.read())!=-1){
			System.out.print((char)i);
		}
		
		bp.close();
		ip.close();
		}catch (Exception e){
		System.out.println(e);
		}
	}
	}
	