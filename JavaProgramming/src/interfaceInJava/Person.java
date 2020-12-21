package interfaceInJava;

public class Person implements Student,YouTuber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person obj=new Person();
		obj.makevideo();
		obj.study();
		YouTuber obj1=obj;//upcasting into youtuber
		obj1.editVideo();
		obj1.makevideo();
	}
	

	@Override
	public void makevideo() {
		System.out.println("YouTuber is making videos");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void study() {
		System.out.println("Student is Studying");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editVideo() {
		System.out.println("person is making good video");
		// TODO Auto-generated method stub
		
	}

}

