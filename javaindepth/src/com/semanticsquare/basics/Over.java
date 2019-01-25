class Over {
	
	static void go(int[] array){
		System.out.println("array[0]: " + array[0]);
		System.out.println("array[1]: " + array[1]);
		System.out.println("array[2]: " + array[2]);
		
		array[1] = 22;
		
		
	}
	
	static void go(int i){
		System.out.println("Int I");
	}
	
	static void go(short s){
		System.out.println("Short s");
		
	}
	
	
	public static void main(String[] args){
		int[] array = {1,2,3};
		go(array);
		System.out.println("array[2]: " + array[1]);
		
		Byte h = 25;
		go(h);
		
	}
	
}