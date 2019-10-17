import java.util.Scanner;

public class Bt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x[] = new int [10];
		
		Scanner key = new Scanner(System.in);
		
		//nhap du lieu
		for (int i = 0; i < 10; i++) {
			System.out.print("nhap x["+i+"] = ");
			x[i] = key.nextInt();
	    }
		System.out.println();
		
		//so sanh
		int nhonhat = x[0];
		for (int i = 1; i < 10; i++) {
			if (nhonhat > x[i]) {
				nhonhat = x[i];	
				System.out.println(i);
			}
		}

    }
}