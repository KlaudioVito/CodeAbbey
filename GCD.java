package problems;

import java.util.Scanner;

public class GCD {
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
            int a = Integer.parseInt(subSequence[0]);
            int b = Integer.parseInt(subSequence[1]);
            int tempA = a, tempB = b;    
            int gcd = 0;
            int lcm = 0;
            while(tempA != tempB){
            	if(tempA > tempB)
            		tempA = tempA - tempB;
            	else if (tempA < tempB)
            		tempB = tempB - tempA;
            }
            gcd = tempA;
            lcm = (a*b)/gcd;
            System.out.print("("+gcd + " " + lcm +") ");      
        }
        scan.close();
    }
}
