package problems;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		scan.nextLine();
		ArrayList<String> inputs = new ArrayList<>();
		for(int i = 0; i < size; i++) inputs.add(scan.nextLine());	
		for(String s : inputs) {
			String[] line = s.split("\\s+");
			double A = Double.parseDouble(line[0]);
			double B = Double.parseDouble(line[1]);
			double C = Double.parseDouble(line[2]);
			double D = Double.parseDouble(line[3]);
			double x1 = 0;
			double x2 = 100;
			double xMiddle = (x1 + x2) / 2;
			double f1 = f(A,B,C,D,x1);
			double f2 = f(A,B,C,D,x2);
			double fMiddle = f(A,B,C,D,xMiddle);
			while(fMiddle != 0){
				//if()
			}
			
			
			DecimalFormat out = new DecimalFormat("##.0000000");
			//System.out.println(out.format(f));
		}
		scan.close();
	}
	private static double f(double A, double B, double C, double D, double x){
		
		return (A*x + B*( Math.sqrt(Math.pow(x, 3))) - C * Math.exp((-x/50)) - D);
	}

}
