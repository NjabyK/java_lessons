import java.util.Scanner;

public class LongConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please pass a long value:");
        String inputString = in.nextLine();
        long longValue = Long.parseLong(inputString);
        System.out.println("The long value you passed: " + longValue);
    }
}
