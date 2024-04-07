public class Arithmetic1{
	
	public static void main(String[] args){
		int x = 5;
		int y = 2;
		int z = 3;
		
		x += 6;
		z %= 7;
		z += y * x;
		y *= 8;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
