import java.util.Scanner;

public class Student {
	String name;
	int age;
	float java, c;
	float avg;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getJava() {
		return java;
	}

	public void setJava(float java) {
		this.java = java;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg() {
		this.avg = (this.getC() + this.getJava())/2;
	}
	public void input() {
		Scanner scn = new Scanner(System.in);
		System.out.print("nhap ten: ");
		this.setName(scn.nextLine());
		
		System.out.print("nhap tuoi: ");
		this.setAge(scn.nextInt());
		
		System.out.print("nhap diem java: ");
		this.setJava(scn.nextFloat());
		
		System.out.print("nhap diem c: ");
		this.setC(scn.nextFloat());
		this.setAvg();
		
	}
	public void output() {
		System.out.println("|"+this.getName()+"|\t"+this.getAge()+"|\t"+this.getC()+"|\t"+this.getJava()+"|\t"+this.getAvg());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st[] =new Student[5];
		for(int i = 0; i < 5; i++) {
			Student x = new Student();
			x.input();
			st[i] = x;
			
		}
		for(int i = 0; i < 5; i++) {
			st[i].output();
			
		}
		 Student  max = new Student();
	       max = st[0];
	   for (int i=0;i<5;i++) {
		   if (st[i].getAvg()>max.getAvg()) {
	       max = st[i];
	}
}
	   System.out.println("Ten sinh vien co diem trung binh cao nhat la :" + max.getName());
	   System.out.println("so diem trung binh cao nhat la: "+ max.getAvg());
	   //
	   for (int i =0 ; i<5;i++) {
		   for (int j = i+1 ; j<5;j++) { 
			   if(st[i].getAvg()>st[j].getAvg()) {
				   Student boss = new Student();
				   boss = st[i];
				   st[i] = st[j];
				   st[j] = boss;
			   }
		   }
	   }
	   System.out.println("Sap xep diem sinh vien theo chieu tang dan la:" );
	   for (int i=0 ;i<5;i++) {
		   System.out.print("Ho va ten: "+ st[i].getName());
		   System.out.println("\t"+ st[i].getAvg());  
      }
	}

}
