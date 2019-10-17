import java.util.Scanner;

public class QuanLySinhVien {

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		SinhVien[] dsSinhVien = new SinhVien[5];
		while (true) {
			System.out.println("-----------menu-----------");
			System.out.println("1. Nhap danh sach sinh vien.");
			System.out.println("2. In ra danh sach sinh vien.");
			System.out.println("3. Sinh vien co diem trung binh cao nhat");
			System.out.println("4. Sap xep sinh vien co diem trung binh theo chieu tang dan");
			System.out.println("5. Danh sach sinh vien cos diem trung binh duoi 4.");
			System.out.println("6. Thong ke sinh vien.");
			System.out.println("0. Thoat");
			int n = scn.nextInt();
			if (n == 1) {
				for (int i = 0; i < 5; i++) {
					SinhVien sv = new SinhVien ();
					sv.nhap();
					dsSinhVien[i] = sv;
				}
			} else if (n == 2) {
				for (int i = 0; i < 5; i++) {
					dsSinhVien[i].xuat();
				}
			}
			else if(n== 3) {
				SinhVien max = new SinhVien();
				max = dsSinhVien[0];
				for (int i = 0; i < 5; i++) {
					if (dsSinhVien[i].getDiemTb() > max.getDiemTb()) {
						max = dsSinhVien[i];
					}
				}
				System.out.println("Ten Sinh vien co diem cao nhat : "+ max.getTen());
    			System.out.println("So diem cao nhat : "+max.getDiemTb());
			} else if (n == 4) {
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						if (dsSinhVien[i].getDiemTb() > dsSinhVien[j].getDiemTb()) {
							SinhVien dem = new SinhVien();
							dem = dsSinhVien[i];
							dsSinhVien[i] = dsSinhVien[j];
							dsSinhVien[j] = dem;
						}
					}
				}
				System.out.println("Sap xep sinh vien theo diem trung binh tang dan: ");
				for (int i = 0; i < 5; i++) {
					System.out.println(dsSinhVien[i].getTen()+"|"+dsSinhVien[i].getDiemTb());
				}
			} else if (n == 5) {
				for (int i = 0; i < 5; i++) {
					if (dsSinhVien[i].getDiemTb() < 4) {
						System.out.println("Sinh vien co diem trung binh duoi 4: "+dsSinhVien[i].getTen()+"|"+dsSinhVien[i].getDiemTb());
					} else if (dsSinhVien[i].getDiemTb()>4) {
						System.out.println("Khong co sinh vien nao co diem tb duoi 4.");
					}
				}
			} else if (n == 6) {
				int a = 0;
				int b = 0;
				int c = 0;
				for (int i = 0; i < 5; i++) {
					
					if (dsSinhVien[i].getDiemTb() >= 8.5) {
						a++;
						
						System.out.println("Sinh vien dat loai xuat sac: "+dsSinhVien[i].getTen()+"|"+dsSinhVien[i].getDiemTb());
						}
					if (dsSinhVien[i].getDiemTb() <= 8.4) {
						if (dsSinhVien[i].getDiemTb() >= 8.0) {
							b++;
							
							System.out.println("Sinh vien dat loat gioi: "+dsSinhVien[i].getTen()+"|"+dsSinhVien[i].getDiemTb());
						}
					}
					if (dsSinhVien[i].getDiemTb() < 8 ) {
						if (dsSinhVien[i].getDiemTb() >= 7) {
							c++;
							System.out.println("Sinh vien dat loai kha: "+dsSinhVien[i].getTen()+"|"+dsSinhVien[i].getDiemTb());
						}
					
					}
				}
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("So luong sinh vien xuat sac: "+a);
				System.out.println("So luong sinh vien gioi: "+b);
				System.out.println("So luong sinh vien kha: "+c);				
				} else if (n == 0) {
					System.out.println("Thoat khoi chuong trinh.");
					return;
				}
			}
		}

}
