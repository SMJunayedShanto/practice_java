package practice_polymorphism;

//run time polymorphism

class Testt{
	public void display() {
		System.out.println("Hello !");
	}
}

class Test2 extends Testt{
	@Override
	public void display() {
		System.out.println("Hellooooo !");
	}
}

public class PolymorphismUsingMethodOverriding {

	public static void main(String[]args) {
		Testt test = new Testt();
		
		test.display();
		
		Test2 test2 = new Test2();
		
		test2.display();
	}
}
