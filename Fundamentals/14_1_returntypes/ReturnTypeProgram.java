import java.util.Scanner;

public class ReturnTypeProgram{
	
	public static void main(String [] args)
	{
		AnInstance instance = new AnInstance();
		//make sure to not reference non static variable or method inside static method, create another class
		
		//we always need to create an object in order to refer to a non-static variable from a static context. Whenever a new instance is created, a new copy of all the non-static variables and methods are created. By using the reference of the new instance, these variables can be accessed. (https://www.geeksforgeeks.org/why-non-static-variable-cannot-be-referenced-from-a-static-method-in-java/)
		instance.printSomething();
	}
	
}

 class AnInstance{
	
	String instanceVariable;
	
	public AnInstance(){
		
	}
	
	public void setVariable(String input){
		
		instanceVariable = input;
	
	}
	public void printSomething(){
	
		Scanner in = new Scanner(System.in);
		System.out.println("Type something");
		String input = in.nextLine();
		in.close();
		setVariable(input);
		System.out.println("What you typed: " + instanceVariable);
	}
	
}