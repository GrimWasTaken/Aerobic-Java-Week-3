
public class Assertion {

	public static void main(String[] args) {
		//String password = "Password that is unexpectedly secure despite being purely text";
		
		int age = 18;
		boolean hasID = false;
		
		assert(hasID);
		
		checkAge(age);
			

	}
	
	public static void checkAge(int check)
	{
		if(check >= 21)
		{
			System.out.println("This person is " + check + " years old and can drink alcohol");
		}
		else
		{
			System.out.println("This person is " + check + " years old and cannot drink alcohol");
		}
	}

}
