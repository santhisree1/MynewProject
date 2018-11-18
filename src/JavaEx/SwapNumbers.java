package JavaEx;

public class SwapNumbers {

	public static void main(String[] args) {

		int x = 100;
		int y = 200;
	/*	
		int temp;
		temp = x;
		x = y;
		y = temp;		
	*/
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("x val is: " + x);
		System.out.println("y val is: " + y);

	}

}
