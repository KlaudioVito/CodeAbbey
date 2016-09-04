package problems;

import java.util.Scanner;

public class SumAB {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		System.out.print("Enter integer A: ");
		a = scan.nextInt();
		System.out.print("Enter integer B: ");
		b = scan.nextInt();
		
		System.out.println("Sum of " + a + " + " + b +" = " +(a + b));
		scan.close();
	}
}
