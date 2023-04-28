package kr.co.exam04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		/* 문제8-A
		 * Random 클래스를 활용하여 다음의 문제를 풀어보세요.
		 * 		1. Scanner 클래스로 사용자로부터 1 ~ 5 사이의 정수 입력 받는다. 
		 * 		2. 1 ~ 45 까지의 난수 6 개를 생성한다.
		 * 		3. 2차 배열을 생성할 때 행의 크기는 사용자 입력값, 열의 크기는 6으로 생성한다.
		 * 		4. 2번에서 생성한 난수를 3번에서 생성한 2차 배열에 전부 저장한다.
		 * 		5. 2차 배열에 저장된 값 출력해서 확인한다.
		 *
		 */
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int row = 0;
		while(true) {
			System.out.print("1 ~ 5 사이의 정수값 입력 : ");
			row = sc.nextInt();
			if(row >= 1 && row <= 5) {
				break;
			}
		}
		int arr[][] = new int[row][6];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < 6; j++) {
				int num = ran.nextInt(45) + 1;
				arr[i][j] = num;
			}
		}
		for(int i = 0; i < arr.length; i++) {
		System.out.println(Arrays.toString(arr[i]));
		}
		sc.close();
	}
}
