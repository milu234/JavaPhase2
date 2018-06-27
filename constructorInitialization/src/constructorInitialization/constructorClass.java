package constructorInitialization;

public class constructorClass {

	int x;
	char c;
	ChainingDemo demo;
	
	public constructorClass() {
		x = 5;
		c='A';
		demo = new ChainingDemo();
		
		}
	
	public constructorClass(int x) {
		this.x=x;
		
	}
	
	public constructorClass(ChainingDemo demo) {
		this.demo = demo;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
