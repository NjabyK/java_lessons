public class Arithmetic4{
	
	public static void main(String[] args){
		SupportingClass util = new SupportingClass();
		
		int y = util.method();
		
		System.out.println(y);
	}

}

class SupportingClass{
	
	
	public static int method(){
		
	static int x = 1;
		return x;
	}

}
