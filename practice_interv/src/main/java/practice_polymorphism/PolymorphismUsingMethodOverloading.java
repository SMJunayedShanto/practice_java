package practice_polymorphism;

class Pattern {

	  // method without parameter
	  public void display() {
	    for (int i = 0; i < 10; i++) {
	      System.out.print("*");
	    }
	    System.out.println("");
	  }

	  // method with single parameter
	  public void display(char symbol) {
	    for (int i = 0; i < 10; i++) {
	      System.out.print(symbol);
	    }
	    System.out.println("");
	  }
	}

public class PolymorphismUsingMethodOverloading {

	public static void main(String[] args) {
		Pattern pattern = new Pattern();
		
		pattern.display();
		
		pattern.display('+');
		
	}

}
