import java.io.*;
class OutputStream1{
	
public static void main(String[]args){
	
try{
	//Creating an object for the inbuilt OutputStream class within the io package
	FileOutputStream op = new FileOutputStream("File1.txt");
	
	//To add a int in the form of char to the desired text file
	op.write(65);
	
	//To add a string to the same file
	String s="Welcome";
	byte b[]=s.getBytes();
	op.write(b);
	
	//To close the OutputStream class
	op.close();
	System.out.println("success");
}catch(Exception e) {
System.out.println (e);
}
//When other try block to add a string to the same file is given
//The file contains nly the string not the previous one
//Therefore using the same object string can be added a above 
//No need of the new object and a new try block or even the nested try block
}
}