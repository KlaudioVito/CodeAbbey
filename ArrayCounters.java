package problems;

import java.util.Scanner;

public class ArrayCounters {
	public static void main (String[] args){
		Scanner scan  = new Scanner (System.in);
		System.out.println("data in: ");
		int M = scan.nextInt();
		int N = scan.nextInt();
		
		int counter[] = new int [N];
		int arr[] = new int [M];
		
		for(int i = 0; i < M; i++){
			arr[i] = scan.nextInt();
			for(int j = 1; j <= N; j++){
				if(j == arr[i])
					counter[j-1]++;
			}
		}
		System.out.println("answer: ");
		for(int k = 0; k < counter.length; k++){
			System.out.print(counter[k] + " ");
		}
		scan.close();
	}
}
