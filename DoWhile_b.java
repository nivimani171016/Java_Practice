	
public class DoWhile_b {

	public static void main(String[] args) {
		// Number is perfect square or not 
		int n =25;
		int x=0;
		do
		{
		 x++;
		}while (x*x<n);
		System.out.println( x*x == n);
	}

}
