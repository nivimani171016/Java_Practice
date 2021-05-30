
public class Ternary_12 {

	public static void main(String[] args) {
		// Difference between if else and the ternary operator 
		        int n, nhalf;
				n = 5;
				if (n%2==0)
				{
					nhalf = n/2;
				}
				else
				{
					nhalf = (n+1)/2;
				}
				System.out.println(nhalf);
				
				
				//Ternary Operator
				int m, mhalf;
				m = 5;
				mhalf = (m%2==0)?m/2:(m+1)/2;
				System.out.println(mhalf);
			
	}

}
