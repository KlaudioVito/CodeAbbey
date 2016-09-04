package problems;

import java.util.Scanner;

public class Rounding {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int arr1[] = new int[size];
		int arr2[] = new int [size];
		float result[] = new float [size];
		for(int i = 0; i < size; i++){
			arr1[i] = scan.nextInt();
			arr2[i] = scan.nextInt();
			result[i] = (float) ((arr1[i]*1.0)/(arr2[i]*1.0));
		}
		System.out.println("answer: ");
		for(int j = 0; j < size; j++){
			System.out.print(Math.round(result[j]) + " ");
		}
		scan.close();
	}
}
