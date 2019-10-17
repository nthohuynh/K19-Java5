package test;

import java.util.Scanner;

public class Bt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		float a,b,x;
		System.out.println("nhap a= ");
		Scanner scn = new Scanner(System.in);
		a= scn.nextFloat();
		System.out.println("nhap b= ");
		b= scn.nextFloat();
		if (a==0) {
			if (b==0) {
				System.out.println("phuong trinh co vo so nghiem");
			}
			if (b!=0) {
				System.out.println("phuong trinh vo so nghiem");
			}
				
		}
		if (a!=0) {
			x = -b/a;
			System.out.println("phuong trinh co nghiem x= "+x);
		}

	}

}
