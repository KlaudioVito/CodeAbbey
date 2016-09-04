package problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	public static void main(String[] args) throws IOException{
		BufferedReader BR = new BufferedReader(new FileReader("C:\\Users/Klaudio/Desktop/words.txt"));
		String[] words = new String[63998];
		String read;
		int index = 0;
		while((read = BR.readLine()) != null){
			words[index] = read;
			index++;
		}
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		String[] arr = new String[size];
		for(int i = 0; i < arr.length; i++){
			arr[i] = scan.next();
		}
		for(String s : arr){
			int count = 0;
			for(int j = 0; j < words.length; j++){
				if(checkAnagram(s, words[j])){
					count++;
				}
			}
			System.out.print(count-1 + " ");
		}
		scan.close();
		BR.close();
	}
	private static boolean checkAnagram(String a, String b){
		char[] c = a.toCharArray();
		char[] d = b.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		if(Arrays.equals(c, d))
			return true;
		return false;
	}
}
