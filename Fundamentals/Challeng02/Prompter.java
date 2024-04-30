import java.util.Scanner;

public class Prompter{
	
	public String prompt(String input){
		System.out.println(input);
		Scanner scInput = new Scanner(System.in);
		String lineInput = scInput.nextLine();
		return lineInput;
	}
	
}