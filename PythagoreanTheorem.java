package problems;

import java.util.Scanner;

public class PythagoreanTheorem {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int[] arr = new int[3*size];
		for(int i = 0; i < arr.length;i++){
			arr[i] = scan.nextInt();
		}
		
		for(int i = 0; i < arr.length; i+=3){
			int a = arr[i];
			int b = arr[i+1];
			int c = arr[i+2];
			if(c == Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))){
				System.out.print("R ");
			}
			else if (c > Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) ){
				System.out.print("O ");
			}
			else if (c < Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) ){
				System.out.print("A ");
			}
		}
		
		
		scan.close();
	}
}
