package problems;

import java.util.Scanner;

public class ArrayChecksum {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int arr[] = new int[size];
		double result = 0;
		int seed = 113;
		int limit = 10000007;
		
		for(int i = 0; i < size; i++){
			arr[i] = scan.nextInt();
			
		}
		for(int j = 0; j < arr.length; j++)
			result = ((result+arr[j])*seed)%limit;
		
		System.out.println("answer: \n" + Math.round(result));
		scan.close();
	}
}
