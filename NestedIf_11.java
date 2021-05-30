
public class NestedIf_11 {

	public static void main(String[] args) {
		// To check whether the number is even or odd and negative
		int n = 5;
		
		if (n<0)
		{
			System.out.println("Given number is negative number");
		}
		else
		{
			if (n%2==0)
			{
				System.out.println("The given number is even");
			}
			else
			{
				System.out.println("The given numeber is odd");
			}
		}

	}

}
