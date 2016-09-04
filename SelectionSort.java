package problems;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int N = scan.nextInt();
		int arr[] = new int[N];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = scan.nextInt();		
		}
		
		while(N > 1){
			int max = arr[0];
			for(int i = 0; i < N; i++){
				if(max < arr[i]){
					max = arr[i];	
					
				}
			}
			System.out.print(getIndex(arr, max) + " " );
			int temp = arr[N-1];
			arr[N-1] = arr[getIndex(arr, max)];
			arr[getIndex(arr, max)] = temp;
			N--;
		}
		scan.close();
	}
	
	private static int getIndex(int[] arr, int element){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == element){
				return i;
			}
		}
		return 0;
	}
}
