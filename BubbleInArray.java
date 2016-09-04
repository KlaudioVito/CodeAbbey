package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleInArray {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		ArrayList<Integer> dataIn = new ArrayList<>();
		String input;
		while(!(input = scan.next()).equals("-1")){
			dataIn.add(Integer.parseInt(input));
		}
		int[] arr = new int[dataIn.size()];
		for(int i = 0; i < arr.length; i++){
			arr[i] = dataIn.get(i);
		}
		int count = 0;
		for(int i = 0; i < arr.length-1; i++){
			if(arr[i] > arr[i+1]){
				int temp = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = temp;
				count++;
			}
		}
		System.out.print(count + " " + (int)checkSum(arr));
		scan.close();
	}
	
	private static double checkSum(int[] arr){
		double result = 0;
		int seed = 113;
		int limit = 10000007;
		for(int j = 0; j < arr.length; j++)
			result = ((result+arr[j])*seed)%limit;
		return result;
	}
}
