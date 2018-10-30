/****************************************************************************
 * Created by: Younes Elfeitori
 * Created on: 26 Oct 2018
 * This is a program about stack which import MrCoxallClass
 ****************************************************************************/

import java.util.*;

public class Stack {
	
	public static void main(String[] args) {
		System.out.println("Enter an Integer that could be put on the stack. ");
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		MrCoxallStack stack = new MrCoxallStack();
		
		// Push the number on the array
		stack.push(user);
		stack.push(10);
		stack.push(500);
		
		// Pop the number out of the array
		stack.pop(user);
		
		// print the array list
		stack.print();
		
		// Count how many numbers in the array list
		stack.count();

	}
	
}
