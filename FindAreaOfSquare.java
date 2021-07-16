package Lab.week1;
import java.util.Scanner;
public class FindAreaOfSquare {
 public static void main(String[] args) {
	System.out.println("Enter the side of the square");
	Scanner scanner = new Scanner(System.in);
	
	double side = scanner.nextDouble();
	
	double area = side*side ;
	
	System.out.println("Area of square is : "+ area);
	
}
}
