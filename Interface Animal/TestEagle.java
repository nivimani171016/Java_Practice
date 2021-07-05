//eg2
//Interference
public class TestEagle {

	public static void main(String[] args) {
		Eagle myEagle = new Eagle();
		myEagle.eat();
		myEagle.sound();
		myEagle.fly();
		
		System.out.println ("Number of legs: " + Birds.numberOfLegs); //Accessing the interface
		System.out.println ("Outer Covering : " + Birds.outerCovering); //Accessing the interface elements
	}

}
