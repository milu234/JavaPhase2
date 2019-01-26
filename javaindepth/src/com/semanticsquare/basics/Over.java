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
	
	static void varargsOverload(boolean b , int i , int j , int k){
		System.out.println("\n Inside varargsOverload without varargs ... ");
	}
	
	static void varargsOverload(boolean b , int... list){
		System.out.println("\n Inside varargsOverload with varargs ... ");
		System.out.println("list.length : "+ list.length);
	}
	
	
	public static void main(String[] args){
	/*	int[] array = {1,2,3};
		go(array);
		System.out.println("array[2]: " + array[1]);
		
		Byte h = 25;
		go(h);
		*/
		
		varargsOverload(true , 1,2,3);
		varargsOverload(true , 1,2,3,4,5,6,7,8);
		varargsOverload(true);
		
	}
	
}