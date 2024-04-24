import java.util.Scanner;
import java.time.LocalDate;
import java.util.regex.Pattern;

public class Challenge1{
	
	public static void main(String [] args){
		
		//Challenge Part 1: Prompt User For Inputs
		Prompt systemPrompt = new Prompt();
		
		String name = systemPrompt.prompt("What is your name:");
		
		String surname = systemPrompt.prompt("What is your surname:");
		
		String date_of_birth = systemPrompt.prompt("Enter your date of birth (DD/MM/YYYY):");
		
		String distance_from_store = systemPrompt.prompt("How far is your favourite store from your home?");
		
		//Challenge Part 2: Greeting + Validate Date + Calculate
		System.out.println('\n' + "Hello "+ systemPrompt.formatNames(name) + " " + systemPrompt.formatNames(surname));
		
		DateValidator validateDate = new DateValidator();
		int yearsold = 0;
		if(validateDate.isValid(date_of_birth)){
			
			date_of_birth = validateDate.returnDOB();
			int currentYear = validateDate.getCurrentYear();
			
			//Calculate age
			yearsold = currentYear - Integer.parseInt(validateDate.returnYear(date_of_birth)); 
			System.out.println('\n' + "You are "+ yearsold + " years old.");
			
		};
		
		//Challenge Part 3: Convert KM to Miles + print distance in miles + print age in seconds + print age milisecnds + display user age in hex and binary
		MilesCalculator milesCalc = new MilesCalculator();
		double distanceInMiles = milesCalc.convertToMiles(distance_from_store);
		System.out.println('\n' + "In Miles, this is hw far your favourite stoe is from home: " + distanceInMiles);
		
		AgeCalculator ageCalc = new AgeCalculator();
		System.out.println('\n' + "Your Age in Seconds: " + ageCalc.ageInSeconds(yearsold));
		System.out.println('\n' + "Your Age in Miliseconds: " + ageCalc.ageInMiliseconds(yearsold));
		System.out.println('\n' + "Your Age in Hex Format: " + ageCalc.ageInHex(yearsold));
		System.out.println('\n' + "Your Age in Binary Format: " + ageCalc.ageInBinary(yearsold));
		
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
		
		//Capitilize Firts Letter of Names
		public String formatNames(String name){
			
			String firstLetter = name.substring(0, 1);
			String restOfName = name.substring(1, name.length());
			
			firstLetter = firstLetter.toUpperCase();
			restOfName = restOfName.toLowerCase();
			
			return firstLetter+restOfName;
			
		}
	
}

public class DateValidator{
	
	public String dOB;
	
	public DateValidator(){
		this.dOB = dOB;
	}
	
	public String returnDOB(){
		return dOB;
	}
	
	public String returnDay(String date){
		String day = "" + date.charAt(0) + date.charAt(1);
		return day;
	}
	
	public String returnMonth(String date){
		String month = date.split("/")[1];
		return month;
	}
	
	public String returnYear(String date){
		String year = date.split("/")[2];
		return year;
	}
	
	public boolean isValid(String date){
		
		Prompt systemPrompt = new Prompt();
		NumberValidator verifyDigit = new NumberValidator();
		
		if((returnDay(date).length() == 2) && (returnMonth(date).length() == 2) && (returnYear(date).length() == 4)){
			//Verify if date is numeric
			if(verifyDigit.isNumeric(returnDay(date))  &&
				verifyDigit.isNumeric(returnMonth(date)) && 
				verifyDigit.isNumeric(returnYear(date)))
			{
				dOB = date;
			}else{
				dOB = systemPrompt.prompt('\n' +"Please input numeric values(DD/MM/YYYY)");
				isValid(dOB);
			}
		}else{
			dOB = systemPrompt.prompt('\n' + "Please input valid date in valid format (DD/MM/YYYY)");
			isValid(dOB);
		}
		
		return true;
	}
	
	public int getCurrentYear(){
        return LocalDate.now().getYear();
	}
	
}

public class NumberValidator{
	
	public boolean isNumeric(String date){
        return Pattern.matches("\\d+", date);
	}
	
}

public class MilesCalculator{
	
	public double convertToMiles(String distance){
		try {
            double km = Double.parseDouble(distance);
            return km * 0.621371;
        } catch (NumberFormatException e) {
			System.out.println('\n' + "Your distance was not in numeric format");
			System.out.println("This is your input: " + distance);
			Prompt systemPrompt = new Prompt();
			String distanceFromStore = systemPrompt.prompt("Enter distance as numeric value");
            return convertToMiles(distanceFromStore);
        }
	}
	
}

public class AgeCalculator{
	
	public long ageInSeconds(int yearsold){
        return yearsold*365*24*60*60;
	}
	
	public long ageInMiliseconds(int yearsold){
        return yearsold*365*24*60*60;
	}
	
	public String ageInHex(int yearsold){
        return Integer.toHexString(yearsold);
	}
	
	public String ageInBinary(int yearsold){
        return Integer.toBinaryString(yearsold);
	}
	
}