package problems;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class ModularCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("data in: ");
        ArrayList<String> sequence = new ArrayList<>();
        String input = null;
        while(!(input = scan.next()).equals("a")){
        	sequence.add(input);
        }
        int output = 0;
        BigInteger result = BigInteger.valueOf(Long.parseLong(sequence.get(0)));
        for(int i = 1; i< sequence.size(); i++){
        	if(sequence.get(i).equals("+")){
        		result = result.add(BigInteger.valueOf(Long.parseLong(sequence.get(i+1)))); 
        	}
        	else if(sequence.get(i).equals("-")){
        		result = result.subtract(BigInteger.valueOf(Long.parseLong(sequence.get(i+1))));
        	}
        	else if(sequence.get(i).equals("*")){
        		result = result.multiply(BigInteger.valueOf(Long.parseLong(sequence.get(i+1))));
        	}
        	else if(sequence.get(i).equals("/")){
        		result = result.divide(BigInteger.valueOf(Long.parseLong(sequence.get(i+1))));
        	}
        	else if(sequence.get(i).equals("%")){
        		result = result.mod(BigInteger.valueOf(Long.parseLong(sequence.get(i+1))));
        	}
        	output = result.intValue();
        }
        System.out.println("Output: " + output);
        scan.close();
    }
}
