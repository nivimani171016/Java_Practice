
public class Exercise_10_While {

	public static void main(String[] args) {
		// To Reverse the number
		int number = 19435;
		int remainder, reverse = 0;
		while (number!=0)
		{
			remainder = number%10;
			reverse =  reverse*10 + remainder;
			number =  number/10;
		}
		System.out.println(reverse);

	}

}
