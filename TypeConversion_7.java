public class TypeConversion_7 {

	public static void main(String[] args) {
		//Converting one data type to the other 
		int a = 5;
		float b;
		b = a; //implicit conversion
		System.out.println("The integer is converted to a float");
		System.out.println(b); //store integer value in the float variable
	
		/*Implicit Conversions wont work for float to int and so Explicit conversion is used */
		int c;
		float d = 2.5F;
		c = (int) d; //explicit conversion
		System.out.println("The float is converted to the integer");
		System.out.println(c); //the value in d is converted to int and stored in the new variable 

		int e = 5;
		float f;
		f = (float) e; //explicit conversion of int to float
		System.out.println("The integer is converted to a float by explicit conversion");
		System.out.println(f);
		
		//Conversion of character to integer
		int g;
		char h = '*'; //character, integer and even any symbols can be used as a character and the ascii value is obtained by the conversion 
		g = (int)h ;
		System.out.println("The character is converted to the integer and displayed as a ASCII value");
		System.out.println(g); //ASCII value gets printed
		int m;
		char n ='5';
		m=(int)n;
		System.out.println(m); //ASCII value of 5 is printed 
		System.out.println("\n");
		
		/*String cant be converted to int or other by explicit or implicit conversion
		  and so new one named 'Integer.parseInt(String_name)' is used*/
		
		String sHeight = "6";
		
		/* int o =(int)sHeight; (gives error that the cast can't be done from string to integer)
		System.out.println("The conversion of the string with 6 stored in it to the integer data type");
		System.out.println(o);*/
		
		int j = Integer.parseInt(sHeight); //use of the function 'Integer.parseInt()'
		System.out.println("The string is converted to integer by the function"); 
		//Not just a single integer but also a large value like 546616 can also be converted by this function 
		System.out.println(j); //Prints the number 6
		
		/*String containing float number cant be converted by using the above Integer.parseInt() method
		 instead use 'Float.parseFloat(String_name) */
		
		String sWeight = "65.43";
		float i = Float.parseFloat(sWeight);
		System.out.println("The given character(string) is coverted to the float by the function");
		System.out.println(i); //Prints 65.43
		
		//I exactly dont know the purpose of these two toString functions. 
		int k = 80;
		System.out.println("The conversion of integer to the string");
		System.out.println(Integer.toString(k));
		float l = 95.62F;
		System.out.println(Float.toString(l));
	}

}
