public class FiniteSum {

	public static void main(String[] args) {
		// To find the finite sum of the numbers
		int n = 100,sum=0;
		for (int i=0;i<n;i++)
		{
			sum+=i;
		}
		System.out.print("The sum of the numbers from 0 to 99 is : ");
		System.out.println(sum);
	}

}
