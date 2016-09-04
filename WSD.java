package problems;

import java.util.Scanner;

public class WSD {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int arr[] = new int[size];
		int result[] = new int [size];
		for(int i = 0; i < size; i++){
			arr[i] = scan.nextInt();
		}
		
		for(int k = 0; k < size; k++){
			int length = (int)(Math.log10(arr[k])+1);
			while (arr[k] != 0) {
                result[k] += (arr[k] % 10)*length;
                length--;
                arr[k] /= 10;
			}
		}
		System.out.println("answer: ");
		for(int j = 0; j < size; j++){
			System.out.print(result[j] + " ");
		}
		scan.close();
	}

}
