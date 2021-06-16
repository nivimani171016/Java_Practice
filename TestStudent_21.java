public class TestStudent_21 {

	public static void main(String[] args) 
	{
		Student_21 std1=new Student_21(); //Creation of the object
		
		//Modifier is public 
		System.out.println ("The roll no of the student is " + std1.roll_no);
		System.out.println ("The name of the student is " + std1.name);
		
		/* Since the roll_no1 and name1 is under the private modifier, this class wont  be able to access the field from student class
		System.out.println ("The roll no of the student is " + std1.roll_no1);
		System.out.println ("The name of the student is " + std1.name1); */
		
		//Modifier is protected
		System.out.println ("The roll no of the student is " + std1.roll_no2);
		System.out.println ("The name of the student is " + std1.name2);
				
	}

}
