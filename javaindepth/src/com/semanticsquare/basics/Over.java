class Over {
	
	static void go(int[] array){
		System.out.println("array[0]: " + array[0]);
		System.out.println("array[1]: " + array[1]);
		System.out.println("array[2]: " + array[2]);
		
		array[1] = 22;
		
		
	}
	
	public static void main(String[] args){
		int[] array = {1,2,3};
		go(array);
		System.out.println("array[2]: " + array[1]);
		
		
	}
	
}