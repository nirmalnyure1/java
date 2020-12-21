package abstraction;

public class WagonR extends Car{
	public void accelerate() {
		System.out.println("wagonR is accelerating");
	}

	@Override
	public void breaking() {
		System.out.println("wagonR is breaking");

		
	}
	
}
