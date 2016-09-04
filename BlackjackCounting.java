package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackjackCounting {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		String input;
		ArrayList<String> arr = new ArrayList<>();
		
		while((input = scan.nextLine()).length() > 0){	
			arr.add(input);
		}
		arr.remove(0);
		char[] c;
		for(String s : arr){
			c = s.toCharArray();
			int sum = 0;
			for(int i = 0; i < c.length; i++){
				if(c[i] == 'A' && (sum+convertToPoints(c[i]) > 21)){
					sum+= 1;
				}
				else{
				
					sum+= convertToPoints(c[i]);
				}
			}
			if(sum > 21){
				System.out.print("Bust" + " ");
			}
			else
				System.out.print(sum + " ");
		}
		scan.close();
	}
	private static int convertToPoints(char c){
		if(c == '2'){
			return 2;
		}else if (c == '3'){
			return 3;
		}else if (c == '4'){
			return 4;
		}else if (c == '5'){
			return 5;
		}else if (c == '6'){
			return 6;
		}else if (c == '7'){
			return 7;
		}else if (c == '8'){
			return 8;
		}else if (c == '9'){
			return 9;
		}else if (c == 'T'){
			return 10;
		}else if (c == 'J'){
			return 10;
		}else if (c == 'Q'){
			return 10;
		}else if (c == 'K'){
			return 10;
		}else if (c == 'A'){
			return 11;
		}
		return 0;
	}
}
