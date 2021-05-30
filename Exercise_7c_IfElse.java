public class Exercise_7c_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		int b = 2;
		int c = 3;
		if (a>b)
		{
			if(a>c)
			{
				System.out.println("A is the greater number");
			}
			else
			{
				if(a<c)
				{
					System.out.println("C is greater number");
				}	
				else
				{
					System.out.println("A and B are equal");
				}
			}
		}
		else 
		{
			if(b>c)
			{
				System.out.println("B is the greater number");
			}
			else
			{
				if ((a==b)&&(b==c))
				{
					System.out.println("A, B and C are equal");
				}
				else
				{
					if(c>b)
					{
					System.out.println("C is the greater number");
					}
					else
					{
						System.out.println("B and C are equal and greater than A ");
					}
				}
			}
		}
	}
	

}
