//Eg 3
//Encapsulation
public class TestAni {

	public static void main(String[] args) {
		Ani myAnimal = new Ani();
		myAnimal.setName("Eagle");
		myAnimal.setAverageWeight(250.63);
		myAnimal.setNumberOfLegs(2);
		
		System.out.println ("Name: " + myAnimal.getName());
		System.out.println ("Average Weight : " + myAnimal.getAverageWeight());
		System.out.println ("Number of Legs : " + myAnimal.getNumberOfLegs());
		
		/*Can't be created like this becoz though the class is public the members of the class is private
		 * which is access able nly within th cls
		 * myAnimal.name="Doll";
		 */
		
	}

}
