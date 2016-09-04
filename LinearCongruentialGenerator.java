package problems;

import java.util.Scanner;

public class LinearCongruentialGenerator {
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int[] arr = new int[5*size];
		for(int i = 0; i < arr.length; i++){
			arr[i] = scan.nextInt();
		}
		
		for(int i = 0; i < arr.length; i+=5){
			int A = arr[i];
			int C = arr[i+1];
			int M = arr[i+2];
			int X0 = arr[i+3];
			int N = arr[i+4];
			int out = 0;
			for(int j = 0; j < N; j++){
				out = (A*X0+C)%M;
				X0 = out;
			}
			System.out.print(out + " ");
		}
		scan.close();
	}
}
