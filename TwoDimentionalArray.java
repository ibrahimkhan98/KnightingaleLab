package Eve;

public class TwoDimentionalArray {
public static void main(String[] args) {
	int i[][] = {
			{2,3,4,5},
			{14,13,12,15}};
	System.out.println(i[0][3]);
	
	
	System.out.println(i[0].length);
	
	int k[][]=new int[3][4];
	
	k[0][0]=10;
	
	System.out.println(k[0][1]);
	
	int n=0;
	int m=0;
	
	while(n<k.length) {//outer while loop will run 3 times
		while(m<k[n].length) {//inner while loop will run 4 times in every loop of n
			System.out.print(k[n][m]+"\t");
			m++;
		}
		System.out.println();
		m=0;
		n++;
	}
}
}
