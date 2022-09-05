package practice_linkedlist;

import java.util.LinkedList;

public class LinkedListInJava {
	public static void main (String args[]) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		linkedList.add(10);
		linkedList.add(50);
		linkedList.add(2,30);
		linkedList.add(40);
		
		System.out.println(linkedList);
	}
}
