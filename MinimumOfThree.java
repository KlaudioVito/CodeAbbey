package problems;

import java.util.Scanner;

public class MinimumOfThree {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int arr1[] = new int[size];
		int arr2[] = new int [size];
		int arr3[] = new int [size];
		int result[] = new int [size];
		for(int i = 0; i < size; i++){
			arr1[i] = scan.nextInt();
			arr2[i] = scan.nextInt();
			arr3[i] = scan.nextInt();
			if(arr1[i] < arr2[i] && arr1[i] < arr3[i])
				result[i] = arr1[i];
			else if(arr2[i] < arr1[i] && arr2[i] < arr3[i])
				result[i] = arr2[i];
			else
				result[i] = arr3[i];
		}
		System.out.println("answer: ");
		for(int j = 0; j < size; j++){
			System.out.print(result[j] + " ");
		}
		scan.close();
	}
}
