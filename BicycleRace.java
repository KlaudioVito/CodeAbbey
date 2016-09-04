package problems;

import java.util.Scanner;

public class BicycleRace {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("data in: ");
        int size = scan.nextInt();
        scan.nextLine();
        String sequence = null;
        String[] subSequence = null;
      
        System.out.println();
        for (int i = 0; i < size; i++ ) {
            sequence = scan.nextLine();
            subSequence = sequence.split(" ");    
            double s = Integer.parseInt(subSequence[0]);
            double a = Integer.parseInt(subSequence[1]);
            double b = Integer.parseInt(subSequence[2]);
            double time = s /  (a+b);
            double distance = a*time;
            System.out.print(distance + " ");
        }
        scan.close();
    }
}
