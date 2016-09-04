package problems;

import java.util.Scanner;

public class BubbleSort {
	
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = scan.nextInt();
		}
		
		int passes = 1;
		int swaps = 0;
		while(!sorted(arr)){
			for(int i = 0; i < arr.length-1; i++){
				if(arr[i] > arr[i+1]){
					swaps++;
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;	
				}
			}
			passes++;
		}
		System.out.print(passes + " " + swaps + "\n");
		scan.close(); 
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
