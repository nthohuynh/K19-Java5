import java.util.Scanner;

public class Bt5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		float a, b, c;
		System.out.print("Nhap a = ");
		a = key.nextFloat();
		System.out.print("Nhap b = ");
		b = key.nextFloat();
		System.out.print("Nhap c = ");
		c = key.nextFloat();
		if (a == b && a == b && c == b)
			System.out.print("Cac so co gia tri bang nhau");
		else if (a > b && a > c)
			System.out.print("" + a + " la so lon nhat");
		else if (b > a && b > c)
			System.out.print(" " + b + " la so lon nhat");
		else
			System.out.print("" + c + " la so lon nhat");


	}

}
