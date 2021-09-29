package Eve;

public class ClassesAndObjectsDemo2 {
public static void main(String[] args) {
	car volvo = new car();
	System.out.println("current gear...:"+volvo.getGear());
	volvo.changeGear();
	volvo.changeGear();
	System.out.println("Next Gear..:"+volvo.getGear());

}
}


class car{
	int gear =0;
	public void changeGear() {
	if (gear==0) {
		gear=1;
		
	}	
	else if (gear==1) {
		gear=2;
	}
	else if (gear==2) {
		gear=3;
	}
	
	else {
		gear=0;
	}

	
	
	
	}	
	public int getGear() {
		return gear;
	}
	
}