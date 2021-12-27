package abstract_sample_project;

public class Concrete_My_Class extends Abstract_Project implements My_Interface,Boat_MyOwn{

	@Override
	public void myabstactMethod() {
		
		System.out.println("BMW is expensive car");
		
	}

	@Override
	public void myBenz() {
		System.out.println("Benz is expensive too");
		
	}

	@Override
	public void myOvalBoat() {
		System.out.println("my boat is luxury vessel");
		
	}

	@Override
	public void myCar() {
		System.out.println("my car");
		
	}

	@Override
	public void myBMW() {
		
		System.out.println("brand new");
		
	}
	

}
