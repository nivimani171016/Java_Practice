
public class Exercise_8a_NestedIf {

	public static void main(String[] args) {
		// Check whether the number is even and Also a multiple of 11
		int n = 11;
		if (n<0)
		{
			System.out.println("The given  number is negative number");
		}
		else
		{
			if ((n%2==0)&&(n%11==0))
					{
					System.out.println("The given number is even and also a multiple of 11");
					}
			else
			{
				if(n%2==0)
				{
					System.out.println("The number is only even");
				}
				else
				{
					System.out.println("The number is a multipe of 11");
				}
			}
		}
	}

}
