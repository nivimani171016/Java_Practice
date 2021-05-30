
public class ifelse_10 {

	public static void main(String[] args) {
	//Check whether the person is major or minor using the 'if' conditional statements 
	int age = 20;
	if (age > 21)
	{ 
		//Only if the condition satisify the statement is printed else no output jsut blank
		System.out.println("The person is major");
	}
	//Check whether the person is major or minor  using if else statement
	int age1 = 20;
	if(age1>21)
	{
		System.out.println("The person is major");
	}
	else
	{
		System.out.println("The person is minor");
	}
	//Program to print the test score 
	int score=95;
	if (score>=75)
			{
			System.out.println("Student passed the test with the B grade");
			}
	else
	{
	
		if((score>35)&&(score<75))
			{
			System.out.println("Student passed the test with the C grade");
			}
		else
			{
			System.out.println("Student failed th test");
			}	
	}
	}

}
