package practice_abstraction;

abstract class Test{
	int i;
	abstract int test();
}

public class AbstractionInJava extends Test{
	public static void main(String []args) {
		AbstractionInJava abstractionInJava = new AbstractionInJava();
		
		System.out.println(abstractionInJava.test());;
	}

	@Override
	int test() {
		System.out.println("Override");
		return 1;
	}
}
