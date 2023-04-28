package kr.co.exam04;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력으로 5 ~ 10 사이의 정수 값을 입력 받아
		 * 입력 받은 정수값과 동일한 크기의 배열을 생성하세요.
		 * 그리고 배열의 값은 -1로 초기화 하세요.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("======= 답 =======");
		int size = 0;
		
		while(!(size >= 5 && size <= 10)) {
			System.out.print("5 ~ 10 사이의 정수 입력 : ");
			size = sc.nextInt();
		}
		int arr1[] = new int[size];
		for(int i = 0; i  < size; i++) {
			arr1[i] = -1;
			System.out.printf("%d\t", arr1[i]);
		}
		sc.close();
	}
}
