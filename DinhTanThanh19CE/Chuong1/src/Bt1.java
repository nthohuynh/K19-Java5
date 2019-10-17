import java.util.Scanner;

public class Bt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;;
		
		Scanner key = new Scanner(System.in);
		
		for (int i = 1; i <= 100; i+=2) {
			x= x+i;		
		}
		System.out.println("tong cac so le tu 1 den 100 la: "+x);

	}

}
