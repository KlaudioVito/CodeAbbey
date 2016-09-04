package problems;

import java.util.Scanner;

public class CardNames {
	public static void main(String[] args){
		String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"};
		String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int[] arr = new int [size];
		for(int i = 0; i < arr.length; i++){
			arr[i] = scan.nextInt();
			int suit_value = arr[i] / 13;
			int rank_value = arr[i] % 13;
			System.out.print(rank[rank_value] + "-of-" + suits[suit_value] + " ");
		}			
		scan.close();
	}
}
