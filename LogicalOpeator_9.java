public class LogicalOpeator_9 {

	public static void main(String[] args) {
		boolean b;
		int age = 11;
		int weight = 42;
		//use of the AND '&&' Operator
		b = (age<18)&&(weight>40);
		int weight1 = 30;
		//use of the OR '||' Operator
		boolean a = (age>18)||(weight1<30);
		System.out.println(b);
		System.out.println(a);
		//use of the NOT '!' Operator 
		boolean c;
		c = !(age<18);
		System.out.println(c);
	}

}
