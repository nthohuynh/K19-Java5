import java.util.Scanner;

public class SanPham {
	private String tenSanPham;
	private double donGia, giamGia,thueNhapKhau;
		
	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}

	public double getThueNhapKhau() {
		return thueNhapKhau;
	}

	public void setThueNhapKhau(double thueNhapKhau) {
		this.thueNhapKhau = this.getDonGia() * 10 / 100;
	}
	public void nhap() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Nhap ten san pham: ");
		this.setTenSanPham(scn.nextLine());
		System.out.println("Nhap don gia: ");
		this.setDonGia(scn.nextDouble());
		System.out.println("giam gia: ");
		this.setGiamGia(scn.nextDouble());
		this.setThueNhapKhau(thueNhapKhau);
	}
	public void xuat() {
		System.out.println("Ten san pham: "+getTenSanPham());
		System.out.println("Don gia: "+getDonGia());
		System.out.println("Giam gia: "+getGiamGia());
		System.out.println("Thue nhap khau: "+getThueNhapKhau());
	}
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
