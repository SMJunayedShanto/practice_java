package practice_reference;

public class ReferenceInJava {
	double length;
	double breadth;

}

class Test{
	public static void main (String args[]) {
		
		ReferenceInJava referenceInJava = new ReferenceInJava();
		
		ReferenceInJava referenceInJava2 = referenceInJava;
		
		referenceInJava2.length = 20;
		referenceInJava.length = 10;
		
		System.out.println("Value of referenceInJava Length : " + referenceInJava.length);
	    System.out.println("Value of referenceInJava2 Length : " + referenceInJava2.length);
	}
}
