import java.util.Scanner;

public class Lab3 {
	int tuoi;
	String hoTen;
	float diemJava,diemC,diemTb;
	

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public float getDiemJava() {
		return diemJava;
	}

	public void setDiemJava(float diemJava) {
		this.diemJava = diemJava;
	}

	public float getDiemC() {
		return diemC;
	}

	public void setDiemC(float diemC) {
		this.diemC = diemC;
	}

	public float getDiemTb() {
		return diemTb;
	}

	public void setDiemTb() {
		this.diemTb = (this.getDiemC()+this.getDiemJava())/2;
	}
    public void input() {
		Scanner key = new Scanner(System.in);
		System.out.println("nhap ten");
		this.setHoTen(key.nextLine());
		
		System.out.println("nhap tuoi");
		this.setTuoi(key.nextInt());
		
		System.out.println("nhap diem java");
		this.setDiemJava(key.nextFloat());
		
		System.out.println("nhap diem c");
		this.setDiemC(key.nextFloat());
		this.setDiemTb();
		

	}
    public void output() {
    	System.out.println("|"+this.getHoTen()+"|\t"+this.getTuoi()+"|\t"+this.getDiemTb());
    }
    public static void main(String[] args) {
    	Lab3 mang[] = new Lab3[5];
    	for (int i = 0; i < 5; i++) {
			Lab3 x = new Lab3();
			x.input();
			mang[i] = x;
		}
    	for (int i = 0; i < 5; i++) {
			mang[i].output();
		}
    	Lab3  lonnhat = new Lab3();
    	lonnhat = mang[0];
    	for (int i=0;i<5;i++) {
 		   if (mang[i].getDiemTb()>lonnhat.getDiemTb()) {
 	       lonnhat = mang[i];
 	    }
    }
    	 System.out.println("ten sinh vien co diem trung binh cao nhat la: " + lonnhat.getHoTen());
         System.out.println("so diem trung binh cao nhat la: ");
         
         for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (condition) {
					
				}
			}
		}
         


}
}
