package problems;

import java.util.Scanner;

public class VowelCount {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		scan.nextLine();
		String arr[] = new String[size];
		int result[] = new int [size];
		for(int i = 0; i < size; i++){
			arr[i] = scan.nextLine();
			result[i] = 0;
		}	
		int counter = 0;
		System.out.println("answer: ");
		for(int j = 0; j < size; j++){
			for(int k = 0; k < arr[j].length(); k++){
				if(arr[j].charAt(k) == 'a' || arr[j].charAt(k) == 'o' || arr[j].charAt(k) == 'u' || arr[j].charAt(k) == 'i' || arr[j].charAt(k) == 'e' || arr[j].charAt(k) == 'y'){
					result[j] = ++counter;	
				}
			}
			counter = 0;
			System.out.print(result[j] + " ");
		}
		scan.close();
	}

}
