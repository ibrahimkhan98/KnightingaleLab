package Eve;

public class ClassesAndObjectsDemo4 {
	public static void main(String[] args) {
		fan kaitan = new fan();
		for(int i=0;i<10;i++) {
			kaitan.pull();
		}
	}

}

class fan{
	int state = 0;
	public void pull() {
		if (state==0) {
			System.out.println("switch on state....");
			state=1;
		}
		else if (state==1) {
			System.out.println("Mid state");
			state=2;
		}
		else if(state==2) {
			System.out.println("High speed state....");
			state=3;
		}
		else {
			System.out.println("switch off state....");
			state=0;
	}
	
}}