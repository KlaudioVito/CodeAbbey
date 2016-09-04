package problems;

import java.util.Scanner;

public class FtoC {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int arr[] = new int[size];
		float result[] = new float [size];
		
		for(int i = 0; i < size; i++){
			arr[i] = scan.nextInt();	
		}	
		
		System.out.println("answer: ");
		for(int j = 0; j < size; j++){
			result[j] =(float) ((arr[j]-32)/1.8);
			System.out.print(Math.round(result[j]) + " ");
		}
		scan.close();
	}
}
