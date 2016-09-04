package problems;

import java.util.Scanner;

public class ModuloAndTimeDifference {
	final static int secInDay = 86400;
	final static int secInHour = 3600;
	final static int secInMin = 60;
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("data in: ");
		int cases = scan.nextInt();
		int[] arr = new int[8*cases];
		for(int i = 0; i < (8*cases); i++){
			arr[i] = scan.nextInt();
		}
		int time1, time2;
		int[] diffs = new int[cases];
		for(int i = 0, j = 0; i < arr.length;j++, i+=8){
			time1 = arr[i]*secInDay + arr[i+1]*secInHour + arr[i+2]*secInMin + arr[i+3];
			time2 = arr[i+4]*secInDay + arr[i+5]*secInHour + arr[i+6]*secInMin + arr[i+7];
			diffs[j] = time2-time1;
		}
		for(int i = 0; i < diffs.length; i++){
			int[] time = getTime(diffs[i]);
			System.out.print("(" + time[0] + " " + time[1] + " " + time[2] + " " + time[3] + ") ");
		}
		scan.close();
	}
	
	private static int[] getTime(int seconds){
		int[] result = new int[4];
		result[0] = seconds/secInDay;
		int dayRemSecs = seconds % secInDay;
		result[1] = dayRemSecs/secInHour;
		int hourRemSecs = dayRemSecs%secInHour;
		result[2] = hourRemSecs/secInMin;
		int minRemSecs = hourRemSecs%secInMin;
		result[3] = minRemSecs;
		return result;
	}
}
