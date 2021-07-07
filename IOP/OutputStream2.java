import java.io.*;
class OutputStream2{
public static void main(String[]args){
try{
	//Object for the class
	FileOutputStream op = new FileOutputStream("File2.txt");
	
	//To add a string to a desired file
	String s = "Welcome to the Java InputOutput Stream";
	byte b[] = s.getBytes();
	op.write(b);
	
	op.close();
}catch (Exception e){
	System.out.println(e);
}
System.out.println("String is added successfully");
}
}