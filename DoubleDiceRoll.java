package problems;

import java.util.Scanner;

public class DoubleDiceRoll {
	final static int N = 6;
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int[] arr = new int[2*size];
		for(int i = 0; i < arr.length; i++){
			arr[i] = scan.nextInt();
		}
		
		for(int i = 0; i < arr.length; i+=2){
			int R1 = arr[i];
			int R2 = arr[i+1];
			int result = (R1%N+1)+(R2%N+1);
			System.out.print(result + " ");
		}
		scan.close();
	}
}
