import java.util.Scanner;

public class DoubleConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please pass a double value:");
        String inputString = in.nextLine();
        double doubleValue = Double.parseDouble(inputString);
        System.out.println("The double value you passed: " + doubleValue);
    }
}
