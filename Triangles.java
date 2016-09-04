package problems;

import java.util.Scanner;

public class Triangles {
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
            int c = Integer.parseInt(subSequence[2]);
            if(a + b < c || a + c < b || c + b < a)
            	System.out.print("0 ");
            else
            	System.out.print("1 ");
        }
        scan.close();
    }
}
