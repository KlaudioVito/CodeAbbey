package problems;

import java.util.Scanner;

public class ArithmeticProgression {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("data in: ");
        int size = scan.nextInt();
        scan.nextLine();
        String sequence = null;
        String[] subSequence = null;
      
        System.out.println("answer: ");
        for (int i = 0; i < size; i++ ) {
            sequence = scan.nextLine();
            subSequence = sequence.split(" ");    
            int a = Integer.parseInt(subSequence[0]);
            int b = Integer.parseInt(subSequence[1]);
            int n = Integer.parseInt(subSequence[2]);
            int progression = 0;
            for(int j = 0; j < n; j++){
            	progression += a+j*b;
            }
            System.out.print(progression + " ");      
        }
        scan.close();
    }
}
