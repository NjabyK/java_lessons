import java.util.Scanner;

public class ShortConversion{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please pass short value:");
		String inputString = in.nextLine();
		short shortValue = Short.parseShort(inputString);
		System.out.println("The Short value you passed: " + shortValue);
	}
}