import java.util.Scanner;

public class ParamTest1 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter line 1:");
        String str1 = input.nextLine();
		System.out.println("Enter line 2:");
        String str2 = input.nextLine(); 
		System.out.println("Enter line 3:");
        String str3 = input.nextLine();
        
        longestString(str1, str2, str3);
    }
    
    public static void longestString(String str1, String str2, String str3) {
			boolean i = (str1.length() > str2.length()) && (str1.length() > str3.length());
			boolean j = (str2.length() > str1.length()) && (str2.length() > str3.length());
			if(i == true){
				System.out.println("Your longest String: " + str1);
			}
			else if(j == true ){
				System.out.println("Your longest String: " + str2);
			}else{
				System.out.println("Your longest String: " + str3);
			}			
    }
}
