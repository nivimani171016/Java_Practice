public class TestStudent_20_a {

	public static void main(String[] args) {
		//Create an object 
		Student_21 std1=new Student_21();
		//implicit initialization 
		Student_21 std2=new Student_21();
		std2.roll_no=45;
		std2.name="Rohan";
		Student_21 std3=new Student_21();
		std3.roll_no=63;
		std3.name="Hola";
		//Use of the explicit intialization field to access the Student_21 class field
		System.out.println ("The roll number is " + std1.roll_no);
		System.out.println ("The name of the student is " + std1.name);
		//Use of the implicit initialized field 
		System.out.println ("The roll number is " + std2.roll_no);
		System.out.println ("The name of the student is " + std2.name);
		System.out.println ("The roll number is " + std3.roll_no);
		System.out.println ("The name of the student is " + std3.name);
		
	}

}
