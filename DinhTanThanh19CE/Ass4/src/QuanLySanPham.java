import java.util.Scanner;

public class QuanLySanPham {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		SanPham[] dsSanPham = new SanPham[2];
		for (int i = 0; i < 2; i++) {
			SanPham sp = new SanPham();
			sp.nhap();
			dsSanPham[i]= sp;
		}
		for (int i = 0; i < 2; i++) {
			dsSanPham[i].xuat();
		}
	}

}
