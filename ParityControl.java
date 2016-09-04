	package problems;
	
	import java.util.ArrayList;
	import java.util.Scanner;
	
	public class ParityControl {
		public static void main (String[] args){
			Scanner scan = new Scanner (System.in);
			System.out.println("data in: ");
			int input = 0;
			ArrayList<Integer> arr = new ArrayList<>();
			ArrayList<Integer> notCorrupt = new ArrayList<>();
			while((input = scan.nextInt()) != 46){
				
				arr.add(input);
			}
			arr.add(46);
			for(int i : arr){
				String bits = Integer.toBinaryString(i);
				int sum = 0;
				for(int j = 0; j < bits.length(); j++){
					if(bits.charAt(j) == '1'){
						sum++;
					}
				}
				if(sum%2 == 0){
					notCorrupt.add(i);
				}
			}
			
			for(int i : notCorrupt){	
				String bits = Integer.toBinaryString(i);
				if(bits.length() == 8 && bits.charAt(0) == '1'){
					bits = '0' + bits.substring(1, bits.length());
				}
				int ascii = Integer.parseInt(bits, 2);
				System.out.print((char) ascii);
			}
			
			scan.close();
		}
	}
