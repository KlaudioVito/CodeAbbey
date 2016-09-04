package problems;

import java.util.Scanner;

public class SortWithIndexes {
	public static void main(String[] args){
		Scanner scan  = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		int[] sorted = new int [arr.length];
		for(int i = 0; i < arr.length; i++){
			arr[i] = scan.nextInt();
			sorted[i] = arr[i];
		}
		sorted = bubbleSort(sorted);
		for(int i = 0; i < sorted.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(sorted[i] == arr[j]){
					System.out.print((j+1) + " ");
				}
			}
		}
		scan.close();
	}
	
	private static int[] bubbleSort(int[] a){
		int[] arr = a;
		while(!sorted(arr)){
			for(int i = 0; i < arr.length-1; i++){
				if(arr[i] > arr[i+1]){
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;	
				}
			}
		}
		return a;
	}
	
	private static boolean sorted(int[] arr){
		for(int i = 0; i < arr.length-1; i++){ 
	        if (arr[i] > arr[i+1]) {
	            return false; 
	        }
	    }
	    return true;   
	}
}
