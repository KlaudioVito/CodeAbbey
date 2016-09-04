package problems;

import java.util.Scanner;

public class BullsAndCows {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("data in: ");
		int code = scan.nextInt();
		int size = scan.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = scan.nextInt();
			System.out.print(checkBulls(code, arr[i])+ "-" + checkCows(code, arr[i]) + " ");
		}
		scan.close();
	}
	
	private static int checkBulls(int a, int b){
		int bulls = 0;
		int[] a1 = separateDigits(a);
		int[] b1 = separateDigits(b);
		for(int i = 0; i < a1.length; i++){
			if(a1[i] == b1[i]){
				bulls++;
			}
		}
		return bulls;
	}
	
	private static int checkCows(int a, int b){
		int cows = 0;
		int[] a1 = separateDigits(a);
		int[] b1 = separateDigits(b);
		for(int i = 0; i < a1.length; i++){
			for(int j = 0; j < b1.length; j++){
				if(a1[i] == b1[j] && i != j){
					cows++;
				}
			}
		}
		return cows;
	}
	private static int[] separateDigits(int x){
		int[] digits = new int[4];
		int i = 0;
		while(x > 0){
			digits[i] = x%10;
			x /= 10;
			i++;
		}
		return digits;
	}
}
