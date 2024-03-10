import java.util.Scanner;

public class BooleanConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please pass a boolean value (true/false):");
        String inputString = in.nextLine();
        boolean booleanValue = Boolean.parseBoolean(inputString);
        System.out.println("The boolean value you passed: " + booleanValue);
    }
}
