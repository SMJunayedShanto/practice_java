package practice_linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOnLinkedList {

	public static void main(String []args) {
		Queue<String> languages = new LinkedList<String>();
		
		languages.add("Python");
	    languages.add("Java");
	    languages.add("C");
	    System.out.println("LinkedList: " + languages);
	}
}
