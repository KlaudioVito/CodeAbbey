package problems;

import java.util.Scanner;

public class CollatzSequence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("data in: ");
        int size = scan.nextInt();
        int arr[] = new int [size];
      
        System.out.println();
        for (int i = 0; i < size; i++ ) {
           arr[i] = scan.nextInt();
           int count = 0;
           while(arr[i] != 1){
        	   if(arr[i] %2 == 0){
        		   arr[i] = arr[i] / 2;
        	   }
        	   else
        		   arr[i] = 3*arr[i] + 1;
        	   count++;
           }
           System.out.print(count + " ");
        }   
        scan.close();
    }
}
