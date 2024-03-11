import java.util.Scanner;

public class MasterLine{
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please write 3 sentences below (Press enter after each sentence):");
		String sentenceOne = in.nextLine();
		String sentenceTwo = in.nextLine();
		String sentenceThree = in.nextLine();
		String masterLine = sentenceOne + "\n" + sentenceTwo + "\n" +sentenceThree;
		System.out.println("The is your Master Line: \n" + masterLine);
	}
}