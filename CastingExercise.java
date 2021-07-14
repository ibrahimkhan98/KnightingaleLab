public class CastingExercise {
	
	public static void main(String[] args) { 
	byte b=10; 
	 
	int i=b;
	 
	byte c=i;// will not accept
	 
	byte d=(byte)i;.// Type casting makes it possible to store compatible types.
	 
	byte x=10; 
	byte y=20; 
	 
	byte sum=x*y; // Error is thrown because when two bytes are used in a 
	arthmetic operation, the result will be integer
	 
	 } 
	}

}
