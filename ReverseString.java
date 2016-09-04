package problems;

import java.util.Scanner;

public class ReverseString {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("input data: ");
		String input = scan.nextLine();
		char [] temp = input.toCharArray();
	
		System.out.println("answer: ");
		for(int i = temp.length-1; i >= 0; i--)
		System.out.print(temp[i]);
		scan.close();
	}
}
