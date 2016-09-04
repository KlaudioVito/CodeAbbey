package problems;

import java.util.Scanner;

public class MaxMinOfArray {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int arr[] = new int[size];
		
		for(int i = 0; i < size; i++){
			arr[i] = scan.nextInt();		
		}
		int min = arr[0];
		int max = arr[0];
		System.out.println("answer: ");
		for(int j = 1; j < size; j++){
			if(min > arr[j])
				min = arr[j];
			if(max < arr[j])
				max = arr[j];
		}
		System.out.print(max + " " + min);
		scan.close();
	}
}
