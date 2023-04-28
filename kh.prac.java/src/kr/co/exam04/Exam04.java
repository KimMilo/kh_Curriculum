package kr.co.exam04;

import java.util.Scanner;

public class Exam04 {
	
	public static void main(String[] args) {
		/*
		 * 사용자 입력으로 2 ~ 5 사이의 정수 값을 입력 받아
		 * 입력 받은 정수값과 동일한 크기의 배열을 생성하고,
		 * 배열의 값을 초기화 하기 위해 다시 사용자 입력을 사용하여
		 * 1 ~ 10사이의 값만을 입력 받아 초기화하세요
		 * 
		 * ====> 배열을 생성할 때 중복된 값이 없도록 초기화 하세요!!
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("======= 답 =======");
		int size = 0;
		
		while(!(size >= 2 && size <= 5)) {
			System.out.print("2 ~ 5 사이의 정수 입력 : ");
			size = sc.nextInt();
		}
		
		int arr1[] = new int[size];
		
		for(int i = 0; i < size;) {
			System.out.print("1 ~ 10 사이의 정수 입력 : ");
			int num = sc.nextInt();
			if( num >= 1 && num <= 10) {
				boolean isDuplicate = false;
				for(int j = 0; j < size; j++) {
					if(arr1[j] == num) {
						isDuplicate = true;
						break;
					}
				}
				if(!isDuplicate) {
				arr1[i] = num;
				i++;
				}
			}
		}
		for(int i = 0; i < size; i++) {
			System.out.printf("%d\t", arr1[i]);
		}
		sc.close();
	}
}
