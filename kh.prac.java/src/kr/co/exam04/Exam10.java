package kr.co.exam04;

import java.util.Arrays;
import java.util.Random;

public class Exam10 {

	public static void main(String[] args) {
		/*
		 * 1. 10 ~ 99 사이의 랜덤값을 10개 생성하여 정수 배열에 추가한다.
		 * ex) {1,5,8,3,6,9,4,5,6,5}
		 */
		Random ran = new Random();
		
		System.out.println("======= 문제1 =======");
		int arr1[] = new int[0];
		
		for(int i = 0; i < 10;) {
			arr1 = Arrays.copyOf(arr1, arr1.length + 1);
			arr1[i] = ran.nextInt(90)+10;	
			i++;
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println();
	
		/*
		 * 2. 1번에서 생성한 정수값을 짝수와 홀수로 나누어 2차 배열에 추가한다.
		 * ex)
		 * {{8,6,4,6}, {1,5,3,9,5,5}}
		 */
		System.out.println("======= 문제2 =======");
		int arr2[][] = new int[2][0];
		for(int i = 0; i < arr1.length; i++) {
			int idx = arr1[i] % 2;
			arr2[idx] = Arrays.copyOf(arr2[idx], arr2[idx].length + 1);
			arr2[idx][arr2[idx].length -1] = arr1[i];

		}
		
		System.out.println("짝수 : " + Arrays.toString(arr2[0]));
		System.out.println("홀수 : " + Arrays.toString(arr2[1]));
		System.out.println();
		
		/*
		 * 3. 2번에서 생성된 2차 배열에 추가로 10 ~ 99 사이의 랜덤을 생성하여
		 * 	  저장할 때 짝수는 짝수배열에 홀수는 홀수배열에 저장되도록 한다.
		 * 	  (여기에서 추가하는 정수는 2차 배열의 중첩된 배열의 크기가 10개가 
		 *    될 때까지 수행한다. 		
		 *  ex)
		 *  {{8,6,4,6,6,8,4,2,6,8} , {1,5,3,9,5,5,7,1,3,9}}
		 */
		System.out.println("======= 문제3 =======");
		for(;arr2[0].length < 10 || arr2[1].length < 10;) {
			int num = ran.nextInt(90) + 10;
			int idx = num % 2;
			
			if(arr2[idx].length < 10) {
				arr2[idx] = Arrays.copyOf(arr2[idx], arr2[idx].length + 1);
				arr2[idx][arr2[idx].length -1] = num;
			}
		}
		System.out.println("짝수 : " + Arrays.toString(arr2[0]));
		System.out.println("홀수 : " + Arrays.toString(arr2[1]));
		System.out.println();
		
		
		/* 4. 3번에서 완성된 2차 배열의 동일한 열(인덱스)의 값의 합을 구하여 
		 * 	  3번째(2번 인덱스)에 추가할 배열로 만들어 추가한다.
		 * ex)
		 * {{8,6,4,6,6,8,4,2,6,8}, 
		 * {1,5,3,9,5,5,7,1,3,9} , 
		 * {9,11,7,15,11,13,11,3,9,17}}
		 */
		
		System.out.println("======= 문제4 =======");
		int arr3[][] = Arrays.copyOf(arr2, arr2.length + 1);
		arr3[2] = new int[0];
		
		for(int i = 0; i < arr3[0].length; i++) {
			arr3[2] = Arrays.copyOf(arr3[2], arr3[2].length + 1);
			arr3[2][i] = arr3[0][i] + arr3[1][i];
		}
		System.out.println("짝수 : " + Arrays.toString(arr2[0]));
		System.out.println("홀수 : " + Arrays.toString(arr2[1]));
		System.out.println("짝수/홀수 합 : " + Arrays.toString(arr3[2]));
	}
}