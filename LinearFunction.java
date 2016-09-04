package problems;

import java.util.Scanner;

public class LinearFunction {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("data in: ");
        int size = scan.nextInt();
        scan.nextLine();
        String sequence = null;
        String[] subSequence = null;
      
        //System.out.println();
        for (int i = 0; i < size; i++ ) {
            sequence = scan.nextLine();
            subSequence = sequence.split(" ");    
            int x1 = Integer.parseInt(subSequence[0]);
            int y1 = Integer.parseInt(subSequence[1]);
            int x2 = Integer.parseInt(subSequence[2]);
            int y2 = Integer.parseInt(subSequence[3]);
            
            int a = (y2-y1)/(x2-x1);
            int b = (y2*x1 - y1*x2)/(x1-x2);
            
            System.out.print("("+ a + " " + b +") ");
        }
        scan.close();
    }
}
