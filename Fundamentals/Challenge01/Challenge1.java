import java.util.Scanner;

public class Challenge1{
	
	public static void main(String [] args){
		
		//Prompt User For Inputs
		Prompt systemPrompt = new Prompt();
		
		//String name = systemPrompt.prompt("What is your name:");
		
		//String surname = systemPrompt.prompt("What is your surname:");
		
		String date_of_birth = systemPrompt.prompt("Enter your date of birth (DD/MM/YYYY):");
		
		//String distance_from_store = systemPrompt.prompt("How far is your favourite store from your home?");
		
		

		//Greeting
		//System.out.println('\n' + "Hello "+ systemPrompt.formatNames(name) + " " + systemPrompt.formatNames(surname));
		
		//Validate Date
		DateValidator validateDate = new DateValidator();
		if(validateDate.isValid(date_of_birth)){
			date_of_birth = validateDate.returnDateOfBirth();
		};
	}
	
}

public class Prompt{
	
		Scanner scannerInput = new Scanner(System.in);

		public String prompt(String prompt)
		{
			String userInput;
			
			System.out.println(prompt);
			
			userInput = scannerInput.nextLine();
			
			return userInput;
		}
		
		public String formatNames(String name){
			
			String firstLetter = name.substring(0, 1);
			String restOfName = name.substring(1, name.length());
			
			firstLetter = firstLetter.toUpperCase();
			restOfName = restOfName.toLowerCase();
			
			return firstLetter+restOfName;
			
		}
	
}

public class DateValidator{
	
	
	
	public String returnDateOfBirth(){
		
		return date_of_birth;
		
	}
	
	
}