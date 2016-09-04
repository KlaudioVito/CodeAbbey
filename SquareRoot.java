package problems;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int[] x = new int[size];
		int[] n = new int[size];
		double[] r = new double[size];
		for(int i = 0; i < r.length; i++){
			r[i] = 1.0;
		}
		for(int i = 0; i < size; i++){
			x[i] = scan.nextInt();
			n[i] = scan.nextInt();
			for(int j = 0; j < n[i]; j++){
				r[i] = (r[i] + x[i]/r[i])/2;
			}
		}
		for(int i = 0; i < r.length; i++)	
			System.out.print((double)Math.round(r[i] * 10000000000d) / 10000000000d + " ");
		scan.close();
	}
}
