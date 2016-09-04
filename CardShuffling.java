package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class CardShuffling {
	public static void main (String[] args){
		char[] ranks = {'A', '2','3','4','5','6','7','8','9','T','J','Q','K'};
		char[] suits = {'C', 'D', 'H', 'S'};
		ArrayList<String> arr = new ArrayList<>();
		String[] deck = new String[52];
		for(int i = 0; i < suits.length; i++){
			for(int j = 0; j < ranks.length; j++){
				String card = "" + suits[i] + ranks[j];
				arr.add(card);
			}
		}
		for(int i = 0; i < deck.length; i++){
			deck[i] = arr.get(i);
		}
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int[] randoms = new int[52];
		for(int i = 0; i < randoms.length; i++){
			randoms[i] = scan.nextInt();
		}
		for(int i = 0; i < deck.length; i++){
			int pos = randoms[i];
			if(pos > 52)
				pos%=52;
			
			String temp = "";
			temp = deck[i];
			deck[i] = deck[pos];
			deck[pos] = temp;
		}
		for(String s : deck){
			System.out.print(s + " ");
		}
		scan.close();
	}
}
