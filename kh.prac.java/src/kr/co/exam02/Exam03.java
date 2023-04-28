package kr.co.exam02;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력을 활용하여 다음의 데이터를 입력 받고 출력하시오.
		 * 
		 * 카카오의 더치페이와 같이 총 금액과 인원 수를 입력 받고
		 * 인원 수 당 얼마의 금액을 입금하면 되는지 계산하여 출력하세요.
		 * 
		 * 출력 형식은 다음과 같습니다.
		 * 		총 금액 50000원을 5명이 나누어 인당 10000원을
		 * 		다음의 계좌에 입금해주세요. 나머지 금액 0원은 제가
		 * 		부담할게요.
		 * 		입금계좌 : 0000-00-000-0000000
		 * 
		 * 입금 계좌 정보도 추가로 입력 받아야 합니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int totalAmount, count, perAmount, leftAmount;
		String bankNumber;
		
		System.out.print("총 금액을 입력해주세요 > ");
		totalAmount = sc.nextInt(); sc.nextLine();
		
		System.out.print("총 인원수를 입력해주세요 > ");
		count = sc.nextInt(); sc.nextLine();
		
		System.out.print("입금받을 계좌를 입력해주세요 > ");
		
		bankNumber = sc.nextLine();
		
		perAmount = totalAmount / count;
		leftAmount = totalAmount % count;
		
		String message = "총 금액 %,d원을 %,d명이 나누어 인당 %,d원을\n"
				 	+"다음의 계좌에 입금해주세요. 나머지 금액 %,d원은 제가\n"
				 	+"부담할게요.\n"
				 	+"입금계좌 : %s";
				 	
		//cf) 메모장을 활용해서 ""; 안에 붙여넣으면 개행 및 + 넣어서 만들어줌!!!
		// prinf 사용 시 원에 ,해주면 천단위로 구분해줌
		
		System.out.printf(message, totalAmount, count, perAmount,
				leftAmount, bankNumber);
		
		sc.close();
	}

}
