package problems;

import java.util.Scanner;

public class SavingsCalculator {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int[] arr = new int[3*size];
		for(int i = 0; i < arr.length; i++){
			arr[i] = scan.nextInt();
		}
		
		for(int i = 0; i < arr.length; i+=3){
			double S = arr[i];
			double R = arr[i+1];
			double P = arr[i+2];
			double interest = 1+ (P*0.01);
			int years = 0;
			while (S < R){
				S *= interest;
				years++;
			}
			System.out.print(years + " ");
		}
		
		scan.close();
	}

}
