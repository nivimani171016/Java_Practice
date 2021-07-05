//Eg4
//Polymorphism
//Static Polymorphism
//Method overloading
public class BirdP {
	public void fly() {
		System.out.println ("The bird is flying");
	}
	public void fly(int h) {
		System.out.println ("The bird is flying in " + h + "feet");
	}
	public void fly(String name, int h) {
		System.out.println ("The " + name +" is flying in " + h + "feet");
	}
}
