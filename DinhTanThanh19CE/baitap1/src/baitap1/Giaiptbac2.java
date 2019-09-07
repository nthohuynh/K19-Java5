package baitap1;

import java.util.Scanner;

public class Giaiptbac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,c,x1,x2;
		double d;
		
		System.out.print("nhap a= ");
		Scanner key = new Scanner(System.in);
		a= key.nextFloat();
		
		System.out.print("nhap b= ");
		b= key.nextFloat();
		
		System.out.print("nhap c= ");
		c= key.nextFloat();
		
		d = b*b-4*a*c;
		 if (d<0) {
		
			 System.out.println("ptvn");
		}
		 if (d==0) {
			x1 = -b/(2*a);
			System.out.println("pt co nghiem kep x= "+x1);
		}
		 if (d>0) {
			x1 = (float) ((-b + Math.sqrt(d)) / (2*a));
			x2 = (float) ((-b - Math.sqrt(d)) / (2*a));
			System.out.println("x1= "+x1);
			System.out.println("x2= "+x2);
		}

	}

}
