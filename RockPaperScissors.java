package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		ArrayList<String> arr = new ArrayList<>(size+1);
		for(int i = 0; i < size+1; i++){
			arr.add(scan.nextLine());
		}
		arr.remove(0);
		for(int i = 0; i < arr.size(); i++){
			String[] s = arr.get(i).split("\\s+");
			System.out.print(checkWinner(s)+ " ");
		}
		scan.close();
	}
	private static int checkWinner(String[] arr){
		int player1 = 0;
		int player2 = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i].equals("RS")){
				player1++;
			}else if(arr[i].equals("SP")){
				player1++;
			}else if(arr[i].equals("PR")){
				player1++;
			}else if(arr[i].equals("SR")){
				player2++;
			}else if(arr[i].equals("PS")){
				player2++;
			}else if(arr[i].equals("RP")){
				player2++;
			}
		}
		if(player1 == player2){
			return 0;
		}else if(player1 > player2){
			return 1;
		}
		return 2;
	}
}
