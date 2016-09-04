package problems;

import java.util.Scanner;

public class AverageOfAnArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("data in: ");
        int size = scan.nextInt();
        scan.nextLine();
        String sequence = null;
        String[] subSequence = null;
      
        for (int i = 0; i < size; i++ ) {
            sequence = scan.nextLine();
            subSequence = sequence.split(" ");    
            int sum = 0;
            for (int j = 0; j < subSequence.length; j++)
                sum += Integer.parseInt(subSequence[j]);    
            System.out.println(Math.round((((double)sum/(subSequence.length - 1)))) + " ");
        }
        scan.close();
    }
}
