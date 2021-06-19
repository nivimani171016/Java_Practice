
public class StringDemo {

	public static void main(String[] args) {
		
		String greet = "HeLLo";
		String SPACE = " ";
		String name ="JaVa";
		greet = greet.toLowerCase();
		name = name.toUpperCase();
		String msg = greet + SPACE + name;
		int Length = name.length();
		String Msg = greet.concat(name);
		
		System.out.println(msg);
		System.out.println(Length);
		System.out.println(Msg);
	}

}
