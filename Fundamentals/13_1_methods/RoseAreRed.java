public class RoseAreRed{
    public void printRoses(){
        String myVersion = "Roses are red. \n" +
							"Violets are blue. \n" +
							"Seven, eight, nine. \n" +
							"Ten, two";
        System.out.println(myVersion);
    }
    public static void main(String[] args) {
        RoseAreRed rose = new RoseAreRed();
        rose.printRoses();
    }
}
