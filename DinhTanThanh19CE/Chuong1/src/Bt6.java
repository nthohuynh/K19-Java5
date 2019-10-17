import java.util.Scanner;

public class Bt6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x =0 ;
		Scanner key = new Scanner(System.in);
		
		for (int i = 0; i < 100; i++) {
			x = Math.sqrt(i)+x;
			
		}
		System.out.println("tong = "+x);
		

	}

}
