package problems;

import java.util.Scanner;

public class BitCount {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int[] arr = new int [size];
		for(int i = 0; i < arr.length; i++){
			arr[i] = scan.nextInt();
			String str = Integer.toBinaryString(arr[i]);
			int oneCount = 0;
			for(int j = 0; j < str.length(); j++){
				if(str.charAt(j) == '1'){
					oneCount++;
				}
			}
			System.out.print(oneCount + " ");
		}			
		scan.close();
	}
}
