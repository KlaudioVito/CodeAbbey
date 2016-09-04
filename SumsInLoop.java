package problems;

import java.util.Scanner;

public class SumsInLoop {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int arr1[] = new int[size];
		int arr2[] = new int [size];
		int result[] = new int [size];
		for(int i = 0; i < size; i++){
			arr1[i] = scan.nextInt();
			arr2[i] = scan.nextInt();
			result[i] = arr1[i]+arr2[i];
		}
		System.out.println("answer: ");
		for(int j = 0; j < size; j++){
			System.out.print(result[j] + " ");
		}
		
		scan.close();
	}
}
