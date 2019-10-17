import java.util.Scanner;


public class Bt7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub88.........................555555555555555555555555555555+
		Scanner key = new Scanner(System.in);
		int vitri;
		String chuoi1 = "java";
		int x =0;
		int s = 0;
		String chuoi = "welcome to java 5 nhom 1";
		String [] array = chuoi.split(" ");
		for (int i = 0; i < array.length; i++) {
			if (chuoi1.equals(array[i])) {
				x = x+1;
				
			}
			
		}
		System.out.println("so lan xuat hien tu java trong chuoi la: "+x);
		
		
		System.out.println("vi tri tu java trong chuoi la: "+chuoi.lastIndexOf(chuoi1));
		
		System.out.println("chuoi sau khi thay the la: " +chuoi.replace('J', 'j'));
		
		for (int i = 0; i < chuoi.length(); i++) {
			if (Character.isDigit(chuoi.charAt(i))) {
				s = s + 1;
			}
			
		}
		System.out.println("so luong ky tu la so trong chuoi la: "+s);
	}
		
}
