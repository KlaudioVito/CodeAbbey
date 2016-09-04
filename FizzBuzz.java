package problems;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int N = scan.nextInt();
		for(int i = 1; i <= N; i++){
			if(i < 10){
				if(i%3 == 0 && i%5 == 0){
					System.out.print("FizzBuzz ");
				}
				else if (i%3 == 0){
					System.out.print("Fizz ");
				}
				else if(i%5 == 0){
					System.out.print("Buzz ");
				}
				else{
					System.out.print("0"+i + " ");
				}
			}else{
				if(i%3 == 0 && i%5 == 0){
					System.out.print("FizzBuzz ");
				}
				else if (i%3 == 0){
					System.out.print("Fizz ");
				}
				else if(i%5 == 0){
					System.out.print("Buzz ");
				}
				else{
					System.out.print(i + " ");
				}
			}
		}
		scan.close();
	}
	
}
