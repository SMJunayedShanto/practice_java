package practice_encapsulation;

class Test{
	private int id;
	private String name;
	
	public Test(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class EncapsulationInJava {
	public static void main(String[]args) {
		Test test = new Test(1,"Shanto");
		
		System.out.println(test.getName());
	}
}
