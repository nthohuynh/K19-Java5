import java.util.Scanner;

public class Bt9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chuoi;
		Scanner key = new Scanner(System.in);
		System.out.println("moi ban nhap chuoi: ");
		chuoi = key.nextLine();
		
		for (int i = 0; i < chuoi.length(); i++) {
            if (Character.isLetter(chuoi.charAt(i))||chuoi.startsWith("0") || chuoi.startsWith("-") ) {
                System.out.println("day khong phai la chuoi so nguyen");
                break;
            }
            if (i + 1 == chuoi.length()) {
            	Integer.parseInt(chuoi);
                System.out.println(chuoi);
            }
        }


	}

}
