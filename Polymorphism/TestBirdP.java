//Eg4
//Polymorphism
//Static Polymorphism
//Method overloading
import java.util.*;
public class TestBirdP {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println ("Enter the name : ");
		String name = n.nextLine();
		System.out.println("Enter the height in feet : ");
		int h = n.nextInt();		
		BirdP bp = new BirdP();
		bp.fly();
		bp.fly(h);
		bp.fly(name, h);
		
		bp.fly();
		bp.fly(1000);
		bp.fly("Crow", 10);
	}

}
