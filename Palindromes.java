package problems;

import java.util.Scanner;

public class Palindromes {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("data in: ");
		int size = Integer.parseInt(scan.nextLine());
		String[] arr = new String[size];
		for(int i = 0; i < arr.length; i++){
			String input =scan.nextLine().toLowerCase().replaceAll(",", "").replaceAll("!", "").replaceAll(" ", "").replace("-", ""); 
			arr[i] = input;
		}
		
		for(int k = 0; k < arr.length; k++){
			String test = arr[k];
			if(areSame(test, arr[k])){
				System.out.print("Y" + " ");
			}
			else
				System.out.print("N" + " ");		
		}
		scan.close();	
	}
	
	private static boolean areSame(String one, String two){
		for(int i = 0, j =two.length()-1; j > 0; i++, j--){
			if(one.charAt(i) != two.charAt(j)){
				return false;
			}
		}
		return true;
	}

}
