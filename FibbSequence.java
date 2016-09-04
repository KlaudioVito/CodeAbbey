package problems;

import java.util.Scanner;

public class FibbSequence {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int arr[] = new int[size];
		int result[] = new int [size];	
		for(int i = 0; i < size; i++){
			arr[i] = scan.nextInt();	
		}
		System.out.println("answer: ");
		for(int j = 0 ; j < size; j++){
			int count = 0;
			for(int k = 0; k < 1000; k++){
				if(arr[j] == Fibonacci(k))
					break;
				count++;
			}	
			result[j] = count;
			System.out.print(result[j] + " ");
		}
		scan.close();
	}
	
	public static int Fibonacci(int n){
	   if(n == 1 || n == 2){
	      return 1;
	   }
	   return Fibonacci(n-1) + Fibonacci(n -2);
	}
	
}
