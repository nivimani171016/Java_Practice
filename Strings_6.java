
public class Strings_6 {

	public static void main(String[] args) {
		//use of char data type 
		char star = '*'; // char can store just one character within single char 
		char c1='c';
		char c2='a';
		char c3='r';
		System.out.print(star);
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3);
		//print is used instead of println so that all the char appear in the same line continuously
		//But this does not make the word hence String is used
		
		//use of String data type 
		String greet ="Hello learner";
		System.out.println(greet); //output will be printed in combination with the above output and so use of the new line char as println
		System.out.println(greet);
		
		//Addition of strings
		String s1="Hello";
		String s2="learner";
		String msg = s1+s2; //use of '+'
		System.out.println(msg); 
		//No gap or space between two strings and so include a new char data variable with only space
		String s3="Hello";
		String s4="learner";
		char SPACE=' ';
		String c_msg=s3+SPACE+s4;
		System.out.println(c_msg);
		
		//String Operations 
		String s5="HEllO";
		String s6="lEArnER";
		s5=s5.toUpperCase(); //Use of the function 'toUpperCase()'
		s6=s6.toLowerCase();//Use of the function 'toLowerCase()'		
		String c_cmsg=s5+SPACE+s6;
		System.out.println(c_cmsg);
		

	}

}
