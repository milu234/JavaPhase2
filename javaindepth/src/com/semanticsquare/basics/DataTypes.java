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
		
		static int count = 65;  //Can be declared 
		
		// count  = 64;   Cannot be declared again it will give an compiler error  and cannot be used as a variable in the control statements
		
		public static void main(String args[]){
			int count  = 64;   // can be decalred again in the main function and also can be used for the controll statements 
			
			
			typeCasting();
		}
		
		
	
}
