import java.util.Scanner;

public class GetInput1{ 
     public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");        
        String name = in.nextLine();
        System.out.println("What is your surname?");        
        String surname = in.nextLine();
		String fullName = name + " " + surname;
        System.out.println("Hello " + fullName + "!");
    }
}
