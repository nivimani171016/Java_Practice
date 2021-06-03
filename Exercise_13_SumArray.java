
public class Exercise_13_SumArray {

	public static void main(String[] args) {
		// Sum of elements in the array 
		int A[]= {1,2,3,4,5,8,9};
		int j=0,sum=0;
		for (int i=0;i<7;i++)
		{
			j=j+A[i];
		}
		sum = j;
		System.out.println("The sum of the numbers is " + sum);
}
}
