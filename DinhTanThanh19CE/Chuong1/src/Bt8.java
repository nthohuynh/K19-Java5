import java.util.Scanner;

public class Bt8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chuoi;
		Scanner key = new Scanner(System.in);
		System.out.println("moi ban nhap chuoi: ");
		chuoi = key.nextLine();
		
		
		 for (int i = 0; i < chuoi.length(); i++) {
	            if (Character.isLetter(chuoi.charAt(i))||chuoi.startsWith("0") || chuoi.startsWith("-") ) {
	                System.out.println("0");
	                break;
	            }
	            if (Character.isDigit(chuoi.charAt(i))) {
	                System.out.println("day la chuoi so nguyen");
	            }
	        }

	}

}
