package question1.Client;
import java.util.Scanner;

import question1.Services.*;

public class Driver {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ParanthesisChecker paranthesis = new ParanthesisChecker();
		System.out.println("Enter the paranthesis");
		String value = sc.nextLine();
		paranthesis.setParanthesis(value);
		paranthesis.checkBalance();

	}
}
	
