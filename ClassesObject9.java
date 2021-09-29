package Eve;

public class ClassesObject9 {
	int age = 100;
	public ClassesObject9(int age) {
		System.out.println(age);
		System.out.println(this.age);
		new Receiver().met(this);
		System.out.println(this.age);
		
	}
	public static void main(String[] args) {
		new ClassesObject9(10);
	}

}
class Receiver{
	public void met(ClassesObject9 obj) {
		obj.age=1000;
	}
}