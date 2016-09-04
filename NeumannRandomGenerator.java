package problems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NeumannRandomGenerator {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++){
			arr[i] = scan.nextInt();
			Set<Integer> sequence = new HashSet<>();
			int count = 0;
			int random = arr[i];
			while(sequence.add(random)){
				count++;
				random = procedure(random);
			}
			System.out.print(count +" ");
		}
		scan.close();
	}
	private static int procedure(int n){
		int square = n*n;
		String s = String.valueOf(square);
		while(s.length() < 8){
			s = "0" + s;
		}
		String middle = s.substring(2, 6);
		int value = Integer.parseInt(middle);
		return value;
	}
}
