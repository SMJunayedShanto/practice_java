package practice_singletone_class;

public class SingletonInJava {
	
	public static void main(String[] args) {
		TestSingleton inJava = TestSingleton.getInstance();
		TestSingleton inJava1 = TestSingleton.getInstance();
		TestSingleton inJava2 = TestSingleton.getInstance();
		
		System.out.println("Hashcode 1: "+inJava.hashCode());
		System.out.println("Hashcode 2: "+inJava1.hashCode());
		System.out.println("Hashcode 3: "+inJava2.hashCode());
		
		if (inJava == inJava1 && inJava1 == inJava2) {
			  
            // Print statement
            System.out.println(
                "Three objects point to the same memory location on the heap i.e, to the same object");
        }
  
        else {
            // Print statement
            System.out.println(
                "Three objects DO NOT point to the same memory location on the heap");
        }
	}

	
}

class TestSingleton{
private static TestSingleton singletonInJava = null;
	
	public String name;

	private TestSingleton() {
		name = "Singleton class!";
	}
	
	public static TestSingleton getInstance() {
		
		if(singletonInJava == null)
			singletonInJava = new TestSingleton();
		
		return singletonInJava;
	}
}
