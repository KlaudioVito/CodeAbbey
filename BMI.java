package problems;

import java.util.Scanner;

public class BMI {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		float arr1[] = new float[size];
		float arr2[] = new float [size];
		float result[] = new float [size];
		for(int i = 0; i < size; i++){
			arr1[i] = scan.nextFloat();
			arr2[i] = scan.nextFloat();
			result[i] = (float) (arr1[i]/Math.pow(arr2[i], 2));
		}
		System.out.println("answer: ");
		for(int j = 0; j < size; j++){
			if(result[j] < 18.5)
				System.out.print("under ");
			else if (result[j] > 18.5 && result[j] < 25.0)
				System.out.print("normal ");
			else if (result[j] > 25.0 && result[j] < 30.0)
				System.out.print("over ");
			else if (result[j] > 30.0)
				System.out.print("obese ");
		}
		
		scan.close();
	}

}
