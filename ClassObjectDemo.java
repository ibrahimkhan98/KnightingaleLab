package Eve;

public class ClassObjectDemo {
	public static void main(String[] args) {
		human ibrahim = new human() ;
		ibrahim.enjoy(2000);
		new human().enjoy(10000);
	
	}

}


class human {
	int salary=100;
	public void enjoy(int salary) {
		if (salary == 10000) {
			System.out.println("spend salary");
		}
		else {
			
			System.out.println("Work hard");
		}
		
		
	}
	
	
	
	
}
