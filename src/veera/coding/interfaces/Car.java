package veera.coding.interfaces;

public class Car implements Vechicle {

	@Override
	public void engineStart() {
		System.out.println("Car engine starting....");

	}

	@Override
	public void drive() {
		System.out.println("Car ready for drive");

	}

	@Override
	public void engineStop() {
		System.out.println("Car engine stoping....");

	}

}
