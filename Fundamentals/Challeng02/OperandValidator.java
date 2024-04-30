import java.util.regex.Pattern;

public class OperandValidator{
	
	public boolean isNumber(String input){
		return Pattern.matches("\\d+(\\.\\d+)?", input);
	}
	
	public double validateOperand(String number){
		Prompter programPrompt = new Prompter();
		double validNumber;
		
		if(isNumber(number)){
			validNumber = Double.parseDouble(number);
		}else{
			System.out.println("Your input was not numeric.");
			System.out.println("This was your input: " + number);
			validNumber = validateOperand(programPrompt.prompt("Please input your first number. Make sure it is a numeric value"));
		}
		return validNumber;
	}
	
	
}