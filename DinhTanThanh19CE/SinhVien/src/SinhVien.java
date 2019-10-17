import java.util.Scanner;

public class SinhVien {
	private String ten;
	private int tuoi;
	private float diemC,diemJava;
	private float diemTb;
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public float getDiemC() {
		return diemC;
	}
	public void setDiemC(float diemC) {
		this.diemC = diemC;
	}
	public float getDiemJava() {
		return diemJava;
	}
	public void setDiemJava(float diemJava) {
		this.diemJava = diemJava;
	}
	public float getDiemTb() {
		return diemTb;
	}
	public void setDiemTb(float diemTb) {
		this.diemTb = (this.getDiemC() + this.getDiemJava())/2;
	}
	 public void nhap() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		this.setTen(scn.nextLine());
		System.out.println("Nhap tuoi: ");
		this.setTuoi(scn.nextInt());
		System.out.println("Nhap diem java: ");
		this.setDiemJava(scn.nextFloat());
		System.out.println("Nhap diem c: ");
		this.setDiemC(scn.nextFloat());
		this.setDiemTb(diemTb);
	}
	public void xuat() {
		System.out.println(this.getTen()+"|"+this.getDiemTb());
	}
}



