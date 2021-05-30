public class Switch_13 {

	public static void main(String[] args) {
		
		int day =4 ;
		String dname = " ";
		switch (day) {
		case 0:
			dname = "Sunday";
			break;
		case 1:
			dname = "Monday";
			break;
		case 2:
			dname = "Tuesday";
			break;
		case 3:
			dname = "Wednesday";
			break;
		case 4:
			dname = "Thursday";
			break;
		case 5:
			dname = "Friday";
			break;
		case 6:
			dname = "Saturday";
			break;
		default:
			dname = "Wrong choice";
			break;
		}
		System.out.println(dname);
	}

}
