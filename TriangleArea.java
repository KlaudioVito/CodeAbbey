package problems;

import java.util.Scanner;

public class TriangleArea {
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		int[] arr = new int [6*size];
		for(int i = 0; i < arr.length; i++){
			arr[i] = scan.nextInt();	
		}
		for(int i = 0; i < arr.length; i+=6){
			int x1 = arr[i];
			int x2 = arr[i+2];
			int x3 = arr[i+4];
			int y1 = arr[i+1];
			int y2 = arr[i+3];
			int y3 = arr[i+5];
			
			double x = getLength(x1,x3,y3,y1);
			double y = getLength(x1,x2,y1,y2);
			double z = getLength(x2,x3,y2,y3);
			System.out.println(Math.round(areaIs(x,y,z) * 10000000000d) / 10000000000d + " " + areaFromVector(x1,x2,x3,y1,y2,y3));
		}
		scan.close();
	}
	private static double areaFromVector(int x1, int x2, int x3, int y1, int y2, int y3){
		int P = x1 *(y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
		return Math.abs(P)/2;
	}
	private static double areaIs(double a, double b, double c){
		double s = (a+b+c)/2;
		return (double)Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	private static double getLength(int a, int b, int c, int d){
		return (double)Math.sqrt(Math.pow((b-a), 2)+Math.pow((d-c), 2));
	}
}
