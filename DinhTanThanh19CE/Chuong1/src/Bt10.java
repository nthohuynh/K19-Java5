import java.util.Scanner;

public class Bt10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chuoi;
		Scanner key = new Scanner(System.in);
		System.out.print("Hay nhap chuoi: \n");
		chuoi = key.nextLine();
		String daonguoc = new StringBuffer(chuoi).reverse().toString();
		System.out.print("Chuoi dao nguoc la: \n" + daonguoc);

	}

}
