
public class IfTernary {

	public static void main(String[] args) {
		//If statement
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
		m = 7;
		mhalf = (m%2==0)?m/2:(m+1)/2;
		System.out.println(mhalf);
	}

}
