//To check whether both the expressions are same 
public class Exercise_RelationalOperators_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a,b;
		int weight = 30;
		a=!(weight>45);
		b=weight<=45;
		System.out.println(a);
		System.out.println(b);
		if(a==b)
		{
			System.out.println("Both the expression are same ");
		}
		else
		{
			System.out.println("Expressions are different");
		}
	}

}
