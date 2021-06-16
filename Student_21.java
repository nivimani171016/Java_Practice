
public class Student_21 {
	// explicit initialization
	// modifier is public, so visible to all the classes within the same package 
	 int roll_no = 50;
	 String name = "Neha";
	//modifier is changed to the private, so that the fields are accessed within the classes alone
	 private int roll_no1 = 25;
	 private String name1 = "Prema";
	//modifier is changed to protected, so that it can be accessed witin the class
	 protected int roll_no2 = 60;
	 protected String name2 = "Latha";
		//Class contains the method too //behaviour
		void studentDetail() 
		{	
			System.out.println("The roll number is "+ roll_no);
			System.out.println("The name is "+ name);
			System.out.println("The roll number is "+ roll_no1);
			System.out.println("The name is "+ name1);
			System.out.println("The roll number is "+ roll_no2);
			System.out.println("The name is "+ name2);
		}				
}
