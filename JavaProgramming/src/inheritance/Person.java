package inheritance;

public class Person {
	
	protected String name;
	
	Person(String name){
		this.name=name; 
		System.out.println("inside person constructor "+name);
	}
	
	protected void walk() {
		System.out.println("person"+name+"is walking");
	}
	public void eat() {
		System.out.println("person "+name+" is eating");
	}
	
	public static void laughing() {
		System.out.println("person is lauging");
	}

}
