package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MatchingWords {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		ArrayList<String> arr = new ArrayList<>();
		System.out.println("data in: ");
		String input = scan.next();
		while( !input.equals("end")){			
			arr.add(input);
			input = scan.next();
		}
		Set<String> set = new HashSet<>();
		ArrayList<String> ordered = new ArrayList<>();
		for(int i = 0; i < arr.size(); i++){
			if(!set.add(arr.get(i))){
				if(!ordered.contains(arr.get(i)))
					ordered.add(arr.get(i));
			}
		}
		Collections.sort(ordered);
		for(String i : ordered){
			System.out.print(i + " ");
		}
		scan.close();
	}
}
