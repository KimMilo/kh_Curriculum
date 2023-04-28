package kr.co.exam03;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력과 if문을 활용하여 사용자로부터 정수값을
		 * 입력 받았을 때 5의 배수값만 출력하게 하세요.
		 */
		
		// 내가 푼 답
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값(5의 배수)을 입력해주세요 > ");
		int num = sc.nextInt();
		
		if(num % 5 == 0) {
			System.out.println("입력하신 정수는 5의 배수입니다.");
		}
		else {
			System.out.println("입력하신 정수는 5의 배수가 아니므로 프로그램을 종료합니다.");
		}

		sc.close();
	}

}
