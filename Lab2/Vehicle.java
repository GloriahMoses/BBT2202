public abstract class Vehicle{
	// VAriable attributes
	String color, model;
	int year, mileage;
	
	public void accelerate(int speed){
		System.out.println("A vehicle accelerates by: "+ speed);
	};
	public abstract void stop();
	public abstract void gas();
	
	public static void main(String[] args){
		Sedan car = new Sedan();
		car.accelerate(7);//Overidde
		car.accelerate(7.0);//Overload
	}
}

interface Automobile{ 
	int NoOfWheels=4; 
	public boolean airconditioner();
}

class Sedan extends Vehicle implements Automobile{
	
	@Override
	public void accelerate(int a){//override
		System.out.println("Sedan accelerates by: "+ a + " Km/hour");
	}
	
	public void accelerate(double spd){//for overload
		System.out.println("Sedan accelerates by: " + spd + " Km/hour.");
	}
	
	public void stop(){
	System.out.println("Sedan stops");
	}
	
	public void gas(){
		System.out.println("Sedan gas");
	}
	
	public boolean airconditioner(){
		return true;
	}
}

class SportCar extends Vehicle implements Automobile{

	public void stop(){
	System.out.println("Sport Car has stopped");
	}
	
	public void gas(){
		System.out.println("Sport Car gas");
	}
	
	public boolean airconditioner(){
		return false;
	}
}

class Motorcycle extends Vehicle{
	public void stop(){
	System.out.println("Motorcycle has been stopped");
	}
	
	public void gas(){
		System.out.println("Motorcycle's gas");
	}
}
 
 class Bus extends Vehicle{
	public void stop(){
	System.out.println("Bus has stopped");
	}
	
	public void gas(){
		System.out.println("Bus's gas");
	}
 }
 
 class LuxuryBus extends Bus{
 }
 
 class SchoolBus extends Bus{
 }