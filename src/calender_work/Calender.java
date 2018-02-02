package calender_work;

import java.util.Scanner;
import java.util.Calendar;

public class Calender {
	public static void main(String[] args )
	{
		int number ;
		int m;
		int y;

		Scanner sc = new Scanner(System.in);
		System.out.println("반복 횟수를 입력해주세요.");
		number = sc.nextInt();
		
		while(number > 0)
		{
		System.out.println("해당 년을 입력하세요");
		y = sc.nextInt();
		
		System.out.println("해당 월을 입력하세요");
		m = sc.nextInt();
		
		
		if(m > 0 && m < 13)
		{
		
		Calendar test = Calendar.getInstance();
		
		test.set(Calendar.YEAR , y);
		test.set(Calendar.MONTH , m-1);
		test.set(Calendar.DATE, 1);
		
		calendar.week(test.getActualMaximum(Calendar.DAY_OF_MONTH),test.get(Calendar.DAY_OF_WEEK)-1);
		}
		
		else {System.out.println("잘못된 월 입력입니다.");}
		number--;
	}
	}
}



