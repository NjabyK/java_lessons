import java.util.Scanner;

public class IntegerConversion{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please pass integer value:");
		String inputString = in.nextLine();
		int intValue = Integer.parseInt(inputString);
		System.out.println("The integer value you passed: " + intValue);
	}
}