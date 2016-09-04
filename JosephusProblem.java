package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int N = scan.nextInt();
		int K = scan.nextInt();
		int index = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>(N);
        for(int i = 0; i < N; i++){
            arr.add(i);
        }
        while(arr.size() > 1){
        	index = (index + K - 1) % arr.size();
            arr.remove(index);
        }
        System.out.println((arr.get(0) + 1));
        scan.close();
	}
}
