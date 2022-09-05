package practice_polymorphism;

class Test{
	public void poly() {
		System.out.println("Main");
	}
}

class Test1 extends Test{
	public void poly() {
		System.out.println("1");
	}
}

public class PolymorphismInJava{
	
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		
		test1.poly();
	}

}
