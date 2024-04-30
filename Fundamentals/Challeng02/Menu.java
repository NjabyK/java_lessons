public class Menu{
	
	public void executeOperation(){
		
		Prompter programPrompt = new Prompter();
		OperandValidator numValidator = new OperandValidator();
		OperatorValidator opValidator = new OperatorValidator();
		
		//Prompt the user for a number
		String firstNumber = programPrompt.prompt("Please input your first number");
		double firstValidNumber = numValidator.validateOperand(firstNumber);
		
		//Prompt the user for a mathematical operator
		String mathOperator = programPrompt.prompt("Please input your Mathematical Operator [+, -, *, /, %]");
		char validOperator = opValidator.validateOperator(mathOperator);
		
		//Prompt the user for another number
		String secondNumber = programPrompt.prompt("Please input your second number");
		double secondValidNumber = numValidator.validateOperand(secondNumber);
		
		//Perform the operation
		double operationResult = 0;
		switch(validOperator)
		{
			case '+':
				operationResult = firstValidNumber + secondValidNumber;
				break;
				
			case '-':
				operationResult = firstValidNumber - secondValidNumber;
				break;
			
			case '*':
				operationResult = firstValidNumber * secondValidNumber;
				break;
			
			case '/':
				operationResult = firstValidNumber / secondValidNumber;
				break;
			
			case '%':
				operationResult = firstValidNumber % secondValidNumber;
				break;
			default:
				System.out.println("Could not perform operation");
		}	
		
		
		//Print the operation and the output. Therefore if the user enters 1 then + 2 you should print 1+2=3 your program should be able to do all the arithmetic operations.
		if (operationResult % 1 == 0) { 
			System.out.println("This is the result of your Math Operation: " + (int)operationResult);
		}else{
			System.out.println("This is the result of your Math Operation: " + operationResult);
		}
		
		//Ensure that the program loops back up and does not exit.
		//You should specify and exit keyword like entering x terminates the program
		char repeat = programPrompt.prompt("Do you want to continue with more Maths? Y/N").toUpperCase().charAt(0);
		switch(repeat)
		{
				case 'Y':
					executeOperation();
					break;
				case 'N':
					operationResult = firstValidNumber + secondValidNumber;
					break;
				default:
					System.out.println("Please chose valid option. Y/N");
		}
	}
	
}
