package problems;

import java.util.Scanner;

public class DiceRolling {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		float arr[] = new float[size];
		for(int i = 0; i < size; i++){
			arr[i] = scan.nextFloat();
		}
		System.out.println("answer: ");
		for(int j = 0; j < size; j++){
			System.out.print((int)Math.floor((arr[j])*6)+1 + " ");
		}
		scan.close();
	}
}
