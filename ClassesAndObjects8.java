package Eve;

public class ClassesAndObjects8 {
public static void main(String[] args) {
	TrainingRoom a = new TrainingRoom();
	TrainingRoom b = new TrainingRoom();
	System.out.println(a.sulab);
	System.out.println(b.sulab);
	
	System.out.println(TrainingRoom.sulab);
	
	System.out.println(a.sanyo);
	System.out.println(b.sanyo);
	
	
}
}
class TrainingRoom{
	Projector sanyo = new Projector();
	static Toilet sulab = new Toilet();
	}
class Projector {
	public Projector() {
		System.out.println("new projector created");
	}
	
}

class Toilet {
	public Toilet(){
		System.out.println("toilet object sreated....");
		
	}
}
