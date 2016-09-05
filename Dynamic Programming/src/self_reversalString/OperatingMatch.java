package self_reversalString;

import java.util.Scanner;

public class OperatingMatch {

	public static void main(String[] args) {
		MatchingReversalIterately match = new MatchingReversalIterately();
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please input the string which need to match: ");
		char[] input = in.nextLine().toCharArray();
		match.renew(input);
		String optimal = match.splitWhole();
		System.out.println("The optimal reversal string is: " +"\""+optimal+"\"." );
		
		in.close();
	}

}
