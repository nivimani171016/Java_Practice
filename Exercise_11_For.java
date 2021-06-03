
public class Exercise_11_For {

	public static void main(String[] args) {
		// Finding an armstrong number where a 3 digit number is equal to the sum of its cube
		
		int i = 153;
		int c=0,a,temp;
		temp = i;
		while(i>0) 
			{
				a=i%10; //3 will be	//5 will be
				i=i/10; //15 will be //1 will be
				c=c+(a*a*a); // 0+(3*3*3) //27+(5*5*5)
			}
			if (temp == c) //if 153==c(153)
			{
				System.out.println("Armstrong number");
			}
			else
			{
				System.out.println("Not an armstrong number");
			}
		
	}

}
