package problems;

import java.util.Scanner;

public class RotateString {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = Integer.parseInt(scan.nextLine());
		int[] K = new int[size];
		String[] s = new String[size];
		String[] result = new String[size];
		for(int i = 0; i < size; i++){
			K[i] = scan.nextInt();
			s[i] = scan.next();
			if(K[i] > 0){
				String chunk1 = s[i].substring(0, K[i]);
				String chunk2 = s[i].substring(K[i], s[i].length());
				result[i] = chunk2.concat(chunk1);
			}
			else if (K[i] < 0){
				String chunk1 = s[i].substring(s[i].length()+K[i], s[i].length());
				String chunk2 = s[i].substring(0, s[i].length()+K[i]);
				result[i] = chunk1.concat(chunk2);
			}	
		}
		for(int i = 0; i < result.length; i++){
			System.out.print(result[i] + " ");
		}
		scan.close();
	}
}
