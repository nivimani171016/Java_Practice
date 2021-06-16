public class TestStudent {
	//Creation of other class to access the class variables by creating objects 
		public static void main(String[] args) 
		{
			//Creation of the object 
			Student_20 std1=new Student_20();
			//Student_20() is the class name 
			// std1 is the reference variable 
			// new is the key word to create the object 
			Student_20 std2=new Student_20();
			//Creation of the other object //differes in the memory location
			System.out.println ("Test student contains " + std1);
			System.out.println ("Test student contains " + std2);
			std2=std1;
			System.out.println (std2);
			
		}
	}


	
