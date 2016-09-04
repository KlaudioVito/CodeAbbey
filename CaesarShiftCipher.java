package problems;

import java.util.Scanner;

public class CaesarShiftCipher {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int k = scan.nextInt();
		String[] arr = new String[size+1];
		for(int i = 0; i < arr.length; i++){
			arr[i] = scan.nextLine();
			arr[i] = decrypt(arr[i], k);
			System.out.print(arr[i] + " ");
		}
		scan.close();
	}
	
	private static String decrypt(String encrypted, int key){
		String decrypted = "";
		for(int i = 0; i < encrypted.length(); i++){
			int ch = encrypted.charAt(i);
			if(ch != ' ' && ch != '.'){
				ch -= key % 26;
				if(ch < 'A'){
					ch += 26;
				}
				
			}
			else if(ch == ' '){
				ch = ' ';
			}
			else if(ch == '.')
				ch = '.';
			decrypted += (char) ch;
		}
		return decrypted;
	}
}
