package JavaEx;

public class Arithmetic {
	
public static void main(String[] args) {		
		add(40,60);
		mul(10,30);
	}

	public static void add(int x, int y)
	{
		int z;
		z = x + y;
		System.out.println("Add of two val is: " + z);		
	}
	
	public static void sub(int x, int y)
	{
		int z;
		z = x - y;
		System.out.println("sub of two val is: " + z);		
	}
	
	public static void mul(int x, int y)
	{
		int z;
		z = x * y;
		System.out.println("Mul of two val is: " + z);		
	}	
	

}
