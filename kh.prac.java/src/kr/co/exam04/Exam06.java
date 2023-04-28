package kr.co.exam04;

import java.util.Arrays;
import java.util.Random;

public class Exam06 {

	public static void main(String[] args) {
		/*
		 * 1. 크기가 0인 정수 배열을 생성 후 Random 을 사용하여
		 * 배열의 값들을 초기화한다.
		 * Random은 0 ~ 100 사이의 난수값이 생성되도록 한다.
		 * 배열에는 홀수에 해당하는 값만 5개 저장되도록 한다.
		 */
		System.out.println("======== 답 =======");
		Random random = new Random();
		int odd[] = new int[0];
		
		for(int i = 0; i < 5;) {
			int num = random.nextInt(101);
			if(num % 2 == 1) {
				odd = Arrays.copyOf(odd, odd.length+1);
				odd[odd.length - 1] = num;
				i++;
				System.out.printf("odd 배열에 %d 값 추가함 \n" , num);
				for(int j = 0; j < odd.length; j++) {
					System.out.printf("%d\t", odd[j]);
			}
				System.out.println();
			}
			
		}		
	}
}
