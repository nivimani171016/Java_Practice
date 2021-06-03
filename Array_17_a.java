
public class Array_17_a {

	public static void main(String[] args) {
		int rainfall[]= {25,31,56,85,46,53,94};
		System.out.println(rainfall[3]);
		System.out.println(rainfall[0]);
		//modification of the array
		rainfall[0]= 96;
		System.out.println(rainfall[0]);
		//Create an array
		int square[]= new int[10];	//creates an array of element with 10 integers
		square[0]=1;
		square[1]=2;
		square[2]=9;
		square[3]=16;
		System.out.println(square[6]);
		int n,x; //To assign remaining integers
		for (x=0;x<10;x++)
		{
			n= x+1;
			square[x]=n*n;
		}
		System.out.println("The modified result of the array is" + square[6]);
		//Practice //To print the elements of the array
		int Alpha[]=new int[4];
		Alpha[1]=3;
		Alpha[2]=6;
		Alpha[3]=9;
		int z = Alpha.length; //To find the length of the array
		System.out.println("The length of th earray is " + z);
		System.out.println("The elements of the array using for loop are:");
		for (int i=0;i<Alpha.length;i++)
		{
		System.out.println(Alpha[i]);

		}
		
	}

}
