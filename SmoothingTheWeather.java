package problems;

import java.util.Scanner;

public class SmoothingTheWeather {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		double arr[] = new double[size];
		for(int i = 0; i < size; i++){
			arr[i] = scan.nextDouble();
		}
		double[] resulting = new double[arr.length];
		resulting[0] = arr[0];
		resulting[size-1] = arr[size-1];
		for(int j = 1; j < arr.length-1; j++){
			resulting[j] = (arr[j-1]+arr[j]+arr[j+1])/3;
		}
		System.out.println("answer: ");
		for(int k = 0; k < arr.length; k++)	
			System.out.print((double)Math.round(resulting[k] * 10000000000d) / 10000000000d + " ");
		scan.close();
	}
}
