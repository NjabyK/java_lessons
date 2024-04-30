import java.util.regex.Pattern;

public class OperatorValidator{
	public boolean isMathOpeator(String operator) {
		return Pattern.matches("[+\\-*/%]", operator);
	}
	
	public char validateOperator(String operator){
		Prompter programPrompt = new Prompter();
		char validOperator;
		
		if(isMathOpeator(operator) && (operator.length() == 1)){
			validOperator = operator.charAt(0);
		}else{
			System.out.println("Your input was not a valid mathematical operator.");
			System.out.println("This was your input: " + operator);
			validOperator = validateOperator(programPrompt.prompt("Please input a valid mathematical operator."));
		}
		return validOperator;
	}
}