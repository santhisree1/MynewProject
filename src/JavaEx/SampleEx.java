package JavaEx;

import java.util.Scanner;

public class SampleEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a:");
		int a = sc.nextInt();
		System.out.println("Enter value for b:");
		int b = sc.nextInt();
		int c = a + b;		
		System.out.println("output is: " + c);

	}

}
