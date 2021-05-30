public class IfAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 1;
		int c = 34;
		if ((a>b)&&(a>c))
		{
			System.out.println("A is the largest");
		}
		else
		{
			if ((b>a)&&(b>c))
			{
				System.out.println("B is the largest");
			}
			else
			{
				if (a==b)
				{
					System.out.println("The A and B are equal");
				}
				else
				{
					if(b==c)
					{
						System.out.println("The B and C are equal");
					}
					else
					{
						System.out.println("C is the largest");
					}
				}
			}
		}
	}

}
