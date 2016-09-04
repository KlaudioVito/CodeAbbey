package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class FoolsDay2014 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		scan.nextLine();
		ArrayList<String> inputs = new ArrayList<>();
		for(int i = 0; i < size; i++) inputs.add(scan.nextLine());	
		for(String s : inputs) {
			String[] line = s.split("\\s+");
			int sum = 0;
			for(int i = 0; i < line.length; i++) sum += Math.pow(Integer.parseInt(line[i]), 2);
			System.out.print(sum + " ");
		}
		scan.close();
	}
}
