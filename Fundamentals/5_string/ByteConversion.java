import java.util.Scanner;

public class ByteConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please pass a byte value:");
        String inputString = in.nextLine();
        byte byteValue = Byte.parseByte(inputString);
        System.out.println("The byte value you passed: " + byteValue);
    }
}
