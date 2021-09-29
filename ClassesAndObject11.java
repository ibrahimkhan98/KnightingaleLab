package Eve;
/*
 * 'final'
 * its a keyword which is used to declare constants
 * - final variables - values cannot be changed.
 * - final methods - cannot be overriden
 * - final classes - cannot be inherited
 */

public class ClassesAndObject11 {
	public static void main(String[] args) {
		final float pi=3.14f;
		
		//pi=3.45f;
		
		Lion lion=new Lion();
		lion.hunting();//re-usability - code reusability
		
	}
}
// parent child or inheritance...
 class Animal{
	final public void hunting() {
		System.out.println("hunting ...of animal..called...");
	}
}
class Lion extends Animal{
//	public void hunting() {
//		System.out.println("hunting of lion called..............");
//	}
}


