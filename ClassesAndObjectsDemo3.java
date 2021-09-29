package Eve;

public class ClassesAndObjectsDemo3 {

}



class calculator{
	int n1,n2;
	public void acceptNumberOne(int num1) {
		n1=num1;
	}
	
	public void acceptNumbeTwo(int num2) {
		n2=num2;
	
	}
	public int result(String operation) {
		if(operation.equals("add")) {
			return n1+n2;
		}
		else if(operation.equals("div")) {
			return n1/n2;
		}
		else if(operation.equals("mul")) {
			return n1*n2;
		}
		else {
			return 0;
		}
	}
	
}