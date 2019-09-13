import java.util.Scanner;

public class Bt_mang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = new int [5];
		
		Scanner key = new Scanner(System.in);
		//nhap du lieu
		for (int i = 0; i < 5; i++) {
			System.out.print("nhap x["+i+"] = ");
			x[i] = key.nextInt();
		}
		
		//in ra mang
		System.out.println("in ra mang");
		for (int i = 0; i < 5; i++) {
			System.out.print("\t"+x[i]);
			
		}
		
		//so sanh
		System.out.println();
		int lonnhat = x[0];
		for (int i = 1; i < 5; i++) {
			if (lonnhat < x[i]) {
				lonnhat = x[i];	
			}	
		}
		System.out.println();
		System.out.println("so lon nhat trong mang la:"+lonnhat);
		
		//tinh tong
		int tong = x[0];
		for (int i = 0; i < 5; i++) {
			tong += x[i];
			
		}
		System.out.println();
		System.out.println("tong mang ="+tong);

	}

}
