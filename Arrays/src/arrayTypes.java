
public class arrayTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] c =new int[10]; //Primitive types
		
		String[] b = new String[12]; //Reference types
		
		int [] myArray;
		
		myArray = new int[10];
		
		int[] array =  {10,20,30,45,50};
		
		//For accessing and modifying the value of the array
		
//		for(int counter = 0; counter <array.length;counter++) {
//			System.out.printf("%5d%8d\n",counter,array[counter]);
//		}
//		
		System.out.printf("%5s%8s\n", "Position" , "Value");
		
		
		//Enhanced for loop only you can access the array elements cannot modify it
		for(int number:array) {
			System.out.printf("%13d\n",number);
		}
		
		
		

	}

}
