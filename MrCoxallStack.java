/****************************************************************************
 * Created by: Younes Elfeitori
 * Created on: 26 Oct 2018
 * This is a program about stack class that can import to other class
 ****************************************************************************/

import java.util.ArrayList;

public class MrCoxallStack {
	
	ArrayList<Integer> list = new ArrayList<Integer> ();
	
	public void push(int userInput) {
		list.add(userInput);
	}
	
	public void pop(int userInput) {
		list.remove(list.size()-1);
	}
	
	public void print() {
		System.out.print(list);
	}
	
	public void count() {
		System.out.println("The length of the arrayList is " + list.size());
	}
}
