package kr.co.exam07.ex01;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {		
		/*
			A. 현재 날짜를 구하고 다음 형식에 맞추어 출력하세요.
		 		1. 2022/01/01
		 		2. 2002년 01월 01일
		 		3. 12시 15분 45초
		 		4. 12:15:45
		 */
		
		//1.
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");

		String strDate = df.format(date);
		System.out.println(strDate);
		
		//2.
		df.applyPattern("yyyy년 MM월 dd일");
		strDate = df.format(date);
		System.out.println(strDate);
		
		//3.
		df.applyPattern("HH시 mm분 ss초");
		strDate = df.format(date);
		System.out.println(strDate);
		
		//4.
		df.applyPattern("HH:mm:ss");
		strDate = df.format(date);
		System.out.println(strDate);
		
		System.out.println("----------------------------------------------");
		
		/*
		 * B. 2022년 10월 중 주말에 해당하는 날짜만 문자열 배열에 담아 출력하세요.
		 * 	  사용자 입력으로 년 월 정보를 입력 받아서 해당 월의 주말을 전부 출력하시오.
		 */
		
		df = new SimpleDateFormat("yyyy/MM//dd/EEEE");
		GregorianCalendar gc = new GregorianCalendar(2022, 9, 1);

		Date[] weekend = new Date[0];
				
		for(int i = 0; i < gc.getMaximum(Calendar.DAY_OF_MONTH); i++) {
			
			switch(gc.get(Calendar.DAY_OF_WEEK)) {
				case Calendar.SATURDAY:
				case Calendar.SUNDAY:
					weekend = Arrays.copyOf(weekend, weekend.length + 1);
					weekend[weekend.length - 1] = gc.getTime();
			}
			gc.add(Calendar.DATE, 1);
		}
		for(int i = 0; i < weekend.length; i++) {
			System.out.println(df.format(weekend[i]));
		}
		System.out.println("----------------------------------------------");

		
		/*
		 * C. 사용자 입력으로 년 월 정보를 입력 받아서 해당 월의 주말을 전부 출력하시오.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도 입력 : ");
		int input1 = sc.nextInt();
		System.out.print("월 입력 : ");
		int input2 = sc.nextInt();
		
		df = new SimpleDateFormat("yyyy/MM/dd/EEEE");
		GregorianCalendar gc1 = new GregorianCalendar(input1, input2-1, 1);
		
		Date[] weekend2 = new Date[0];
		
		for(int i = 0; i <= gc1.getActualMaximum(Calendar.DAY_OF_MONTH)-1; i++) {
			
			switch(gc1.get(Calendar.DAY_OF_WEEK)) {
				case Calendar.SATURDAY:
				case Calendar.SUNDAY:
					weekend2 = Arrays.copyOf(weekend2, weekend2.length + 1);
					weekend2[weekend2.length - 1] = gc1.getTime();
			}
			gc1.add(Calendar.DATE, 1);	
		}
		for(int i = 0; i < weekend2.length; i++) {
			System.out.println(df.format(weekend2[i]));
		}
		sc.close();
		
	}
}
