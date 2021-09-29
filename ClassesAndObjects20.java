package Eve;

public class ClassesAndObjects20 {
	
	public static void main(String[] args) {
		SubClass obj = new SubClass();
		
		obj.met();
		obj.met1();
		obj.met2();
	}
	

}


abstract class GrandSuperClass{
	public abstract void met1();
	
}

abstract class SuperClass extends GrandSuperClass{
	
	public SuperClass() {
		System.out.println("abstract class cons called...");
	}
	public void met() {System.out.println("met method of abstract called...");}
	public abstract void met2();
	//there is no compulsion for the abstract class to have abstract methods
	//but if there is a abstract method, then it is compulsory that the class should be declared as
	//abstract
	
}

class SubClass extends SuperClass{
	
	public SubClass() {
		System.out.println("subclass cons called...");
	}
	@Override
	public void met2() {
		System.out.println("met 2 method called...");
	}
	public void met1() {
		
	}
	
	
}
