

public class Exercise_9_Switch {

	public static void main(String[] args) {
		// Adding Mr and Ms to male and female respectively useing the switch statement 
		String name = "Johna";
		int gender = 1;
		String Prefix = " ";
		switch(gender)
		{
		case 0: //Male
			Prefix = "Mr.";
			break;
		case 1: //Female
			Prefix ="Mrs.";
			break;
		}
		System.out.println(Prefix+name);

	}

}
