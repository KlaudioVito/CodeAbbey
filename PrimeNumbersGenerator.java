package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbersGenerator {
	public static void main(String[] args){
		ArrayList<Integer> primes = new ArrayList<>();
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++){
			arr[i] = scan.nextInt();
		}
		for(int i = 0; i < arr.length; i++){
			primes.add(2);
			int number = 3;
			do{
				if(isPrime(number)){
						primes.add(number);
				}
				
				number++;
			}while(primes.size() <= arr[i]);
			System.out.print(primes.get(arr[i]-1) + " ");
			primes.clear();
		}
		scan.close();
	}
	
	private static boolean isPrime(int n){
		if(n%2 == 0)
			return false;
		for(int i = 3; i*i <= n; i+=2){
			if(n%i == 0)
				return false;
		}
		return true;
	}
}
