package exceptionHandling;

public class Main {

	public static void main(String[] args) throws IllegalArgumentException {
		int a=2;
		int b=0;
		try {

			int c=a+b;
			 c=a-b;
			 c=a/b;
			 System.out.println(c);	
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage()+" error occur");
			
		}
		catch(Exception e) {System.out.println("all type of exception");}
		finally {System.out.println("sorry for inconvenience");}
		System.out.println(a);
		fun1();
	}
	
	static void fun1() {
		int a =5; 
		int b= 3; 
		int c =a/b;
		System.out.println(c);
		try {
			fun2();
		}
		catch(Exception e){
			System.out.println(e.getMessage()+" occured");
		}
	
	}
	static void fun2() throws ArrayIndexOutOfBoundsException {
		boolean isDanger =true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("danger is comming ");}
	}

}
