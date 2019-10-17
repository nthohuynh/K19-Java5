package test;

import java.util.Scanner;

public class tintong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cm,inch,feet;
		System.out.println("nhap cm:");
		Scanner key = new Scanner(System.in);
		cm= key.nextDouble();
		inch = cm*2.54;
		feet = inch*12;
		System.out.println("ket_qua_doi_cm_ra_feet= " +feet);
	}

}
