import java.util.Scanner;

public class CharacterConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please pass a sting value you would like to observe:");
        String inputString = in.nextLine();
        char charValue = inputString.charAt(0);
        System.out.println("This is the first character of your string: " + charValue);
    }
}
