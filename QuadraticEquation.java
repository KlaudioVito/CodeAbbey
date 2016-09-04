package problems;

import java.util.Scanner;

public class QuadraticEquation {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int arr[] = new int[3*size];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = scan.nextInt();		
		}
		for(int i = 0; i < arr.length; i+=3){
			int A = arr[i];
			int B = arr[i+1];
			int C = arr[i+2];
			int D = (int) (Math.pow(B, 2)-4*A*C);
			if(D < 0){
				D = (int) Math.sqrt(-D);
				System.out.print((-B/(2*A))+"+"+(D/(2*A)+"i " + (-B/(2*A))+"-"+(D/(2*A)+"i; ")));
			}else{
				int x1 = (int) ((-B + Math.sqrt(D))/(2*A));
				int x2 = (int) ((-B - Math.sqrt(D))/(2*A));
				System.out.print(x1 + " " + x2 + "; ");
			}
		}
		scan.close();
	}
}
