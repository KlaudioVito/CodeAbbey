package problems;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class MatchingBrackets {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("data in: ");
		int size = scan.nextInt();
		ArrayList<String> arr = new ArrayList<>(size+1);
		for(int i = 0; i < size+1; i++){
			arr.add(scan.nextLine());
		}
		arr.remove(0);
		for(int i = 0; i < arr.size(); i++){
			if(checkMatch(arr.get(i))){
				System.out.print("1 ");
			} else
				System.out.print("0 ");
		}
		scan.close();
	}
	private static boolean checkMatch(String s){
		Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '('){
            	stack.push('(');
            } else if (s.charAt(i) == '{'){
            	stack.push('{');
            } else if (s.charAt(i) == '['){
            	stack.push('[');
            } else if(s.charAt(i) == '<'){
            	stack.push('<');
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()){
                	return false;
                }
                if (stack.pop() != '('){
                	return false;
                }
            } else if (s.charAt(i) == '}') {
                if (stack.isEmpty()){
                	return false;
                }
                if (stack.pop() != '{'){
                	return false;
                }
            } else if (s.charAt(i) == ']') {
                if (stack.isEmpty()){
                	return false;
                }
                if (stack.pop() != '['){
                	return false;
                }
            } else if(s.charAt(i) == '>'){
            	if(stack.isEmpty()){
            		return false;
            	}
            	if(stack.pop() != '<'){
            		return false;
            	}
            }
        }
        return stack.isEmpty();
	}
}
