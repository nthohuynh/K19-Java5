import java.util.Calendar;
import java.util.Scanner;

public class Bt11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		month = month + 1;
		System.out.println(day+"/"+month+"/"+year);
	}

}
