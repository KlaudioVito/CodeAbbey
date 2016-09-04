package problems;

import java.util.Scanner;

public class SumInLoop {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int arr[] = new int[size];
		int sum = 0;
		for(int i = 0; i < size; i++){
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		System.out.println("answer: \n" + sum);
		scan.close();
	}

}
