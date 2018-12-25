class DataTypes{

		static void typeCasting(){
			
			System.out.println("\nInside TypeCasting");
			//Explicit Casting
			long y =42;
			int x = (int)y;
			System.out.println("Nornal Value : " + x);
			
			//Information loss due to Explicit TypeCasting
			byte narrowedByte = (byte)123456;
			System.out.println("narrowedByte :  "  + narrowedByte );
			
			// Truncation
			int iTruncated = (int)0.99;
			System.out.println("iTruncated: " + iTruncated);
			
			//Implicit Cast (int to long)

			y = x;
			
			//Implicit Cast (char to int)
			
			char cChar = 'A';
			int iInt = cChar;
			System.out.println("iInt : "+iInt);
			
			//Explicit conversion of byte to Character
			
			byte bByte = 65;
			char dChar = (char)bByte;
			System.out.println("dChar : "+ dChar );
			
			
			
			
			
			
			
			
			
		}
		
		public static void main(String args[]){
			
			typeCasting();
		}
		
		
	
}
