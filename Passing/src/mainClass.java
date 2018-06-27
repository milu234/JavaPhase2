
public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d= 2;
		changeMe(d);
		System.out.println("d = "+d);
		
		Car lamborghini = new Car();
		lamborghini.setSpeed(65.0);
		
		changeCarParameter(lamborghini);
		
		System.out.println("The Speed of Lamborghin is "+ lamborghini.getSpeed());
		
		changeCar(lamborghini);
		System.out.println("The speed of the car is "+lamborghini.getSpeed());
		

	}
	
	public static void changeMe(double d) {
		//this has no effect on d on outside of the method
		d=345.0;
	}
	
	
	public static void changeCarParameter(Car c) {
		//Changes the car speed outside the method
		c.setSpeed(175.0);
		
	}
	
	public static void changeCar(Car c) {
		Car ford = new Car();
		ford.setSpeed(230.0);
		//does not affect outside this method
		c= ford;
	}

}

