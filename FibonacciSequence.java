package problems;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciSequence {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		BigInteger[] arr = new BigInteger [size];
		for(int i = 0; i < size; i++){
			arr[i] = scan.nextBigInteger();		
		}
		for(int i = 0; i < arr.length; i++){
			int index = 2;
			BigInteger fib0, fib1,fib;
			fib0 = BigInteger.ZERO;
			fib1 = BigInteger.ONE;
			fib = BigInteger.ONE;
			if(fib0.equals(arr[i])){
				index = 0;
			}
			else if(fib1.equals(arr[i])){
				index = 1;
			}
			else{
				while(!(fib.equals(arr[i]))){
					index++;
					fib0 = fib1;
					fib1 = fib;
					fib = fib0.add(fib1);
				}
			}
			System.out.print(index + " ");
		}
		scan.close();
	}
}
