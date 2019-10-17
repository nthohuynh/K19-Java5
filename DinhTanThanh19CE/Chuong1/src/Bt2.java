import java.util.Scanner;

public class Bt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = new int [10];
		Scanner key = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("nhap x["+i+"]");
			x[i] = key.nextInt();
		}
		
		//sap xep mang
		for (int i = 0; i < 9; i++) {
			for (int j = i+1; j < 10; j++) {
				if (x[i]<x[j]) {
					int dem = x[i];
					x[i] = x[j];
					x[j] = dem;
				}						
			}
		}
		System.out.println("in ra mang");
		for (int i = 0; i < 10; i++) {
			System.out.print("\t"+x[i]);
		}
	}
}
