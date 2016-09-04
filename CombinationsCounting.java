package problems;

import java.util.Scanner;

public class CombinationsCounting {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int[] arr = new int[2*size];
		for(int i = 0; i < arr.length; i++){
			arr[i] = scan.nextInt();
		}
		for(int i = 0; i < arr.length; i+=2){
			int N = arr[i];
			int K = arr[i+1];
			System.out.print(Math.round(C(N,K)) + " ");
		}
		scan.close();
	}
	private static double C(int N, int K){
		
		return factorial(N)/(factorial(K)*factorial(N-K));
	}
	
	private static double factorial(int n){
		if(n == 0)
			return 1;
		return n*factorial(n-1);
	}
}
