
public class Exercise_12_BinaryToDecimal {

	public static void main(String[] args) {
		// Binary to Decimal using a standard function
		String num = "101010";
		int n = Integer.parseInt(num,2); //Since binary is a base of 2, 2 is added to the last
		System.out.println(n);
		int m = Integer.parseInt(num,16);//dont understand
		System.out.println(m);
		//in case of hexadecimal
		int a = 15261546;
		String b = Integer.toHexString(a);
		System.out.println(b);
		int c = 101011111;
		String d = Integer.toHexString(c);
		System.out.println(d);
		//incase of octal 
		int e = 152166;
		String f = Integer.toOctalString(e);
		System.out.println(f);
		String mr="11010";
		int nr = Integer.parseInt(mr,2);
		System.out.println(nr);
		}

}
