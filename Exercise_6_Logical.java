public class Exercise_6_Logical {

	public static void main(String[] args) {
		//To check whether the given expressions are equivalent
		boolean a;
		boolean b;
		int age = 18;
		int weight = 55;
		a=(age>18);
		b=(weight<50);
		boolean c = (!a)&&(!b);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		boolean d = !(a&b);
		System.out.println(d);
		if (c==d)
		{
			System.out.println("Both the expressions are equal");
		}
		else
		{
			System.out.println("Expressions vary");
		}
		
	}

}
