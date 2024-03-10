import java.util.Scanner;

public class FloatConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please pass a float value:");
        String inputString = in.nextLine();
        float floatValue = Float.parseFloat(inputString);
        System.out.println("The float value you passed: " + floatValue);
    }
}
