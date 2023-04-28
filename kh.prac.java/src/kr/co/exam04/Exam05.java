package kr.co.exam04;

import java.util.Random;

public class Exam05 {
	
	public static void main(String[] args) {
		
		/* 문제1
		 * 1. 크기가 10인 정수 배열을 생성 후 Random을 사용하여
		 * 배열의 값들을 초기화 한다.
		 * Random은 0 ~ 100 사이의 난수값이 생성되도록 한다. */
		
		Random random = new Random();
		System.out.println();
		System.out.println("======= 문제1 ========");
		int arr1[] = new int[10];
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = random.nextInt(101);
			System.out.printf("%d\t", arr1[i]);
		}
		System.out.println();
		
		 /* 문제2
		  *	2. 1번에서 생성한 배열을 그대로 사용하여 배열 안에 있는
		  * 정수값 중 짝수에 해당하는 값만 분류하여 출력하도록 한다.
		  * (짝수값의 수량도 마지막에 출력되게 한다.)*/
		System.out.println();
		System.out.println("======= 문제2 ========");
		int count = 0;
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] % 2 == 0) {
				System.out.printf("%d\t", arr1[i]);
				count++;
			}
		}
		System.out.printf("\n생성된 짝수 수 : %d\n", count);
		System.out.println();
		
		/* 문제3
		 * 3. 2번에 의 해 분류된 짝수들만을 모아두기 위한 새로운  정수
		 * 배열을 만들고 저장한다.*/
		System.out.println("======= 문제3 ========");
		System.out.println("짝수들만 모아둔 배열 even");
		int even[] = new int[count];
		
		for(int i = 0, j = 0; i < arr1.length || j < even.length; i++) {
			if(arr1[i] % 2 == 0) {
				even[j] = arr1[i];
				j++;
			}
		}
		for(int i = 0; i < even.length; i++) {
			System.out.printf("%d\t", even[i]);
		}

	}
}
