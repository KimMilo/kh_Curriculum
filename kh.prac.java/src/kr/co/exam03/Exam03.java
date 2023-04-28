package kr.co.exam03;

import java.util.Scanner;

public class Exam03 {
	
	public static void main(String[] args) {
		/*
		 * 사용자 입력과 if문을 활용하여 사용자로부터 정수값
		 * 2개를 입력 받아 나누기 계산을 수행하고 그 결과를
		 * 출력하세요. 만약 사용자 입력값 중에 0이 있어서
		 * 산술에러가 발생하는 경우 이를 처리하기 위한 if문을
		 * 추가로 작성하세요. 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("정수값1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수값2 : ");
		int num2 = sc.nextInt();
		
		if(num2 != 0) {
			System.out.println("정수값1 / 정수값2 = " + num1 / num2 );
		}
		else if(num2 == 0) {
			System.out.println("정수값2가 0이므로 나누기를 실행할 수 없습니다.");
			System.out.println("대신 1로 대체하여 수행합니다.");
			num2 = 1;
			System.out.printf("정수값1 / 정수값2 = %d\n", num1 / num2);
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		sc.close();
	}
	
}