package kr.co.exam07.ex01;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		/* 
		 * 사용자가 입력한 주민등록번호를 통해 남자인지 여자인지를 구분하세요.
		 * 		1. 주민등록번호는 7번째 숫자가 1, 3 이면 남자입니다.
		 * 		2. 주민등록번호는 7번째 숫자가 2, 4 이면 여자입니다.
		 */
		Scanner sc = new Scanner(System.in); 
		
		while(true) {
			System.out.print("주민등록번호 입력 : ");
			String input = sc.nextLine();
			
			if(input.contains("exit")) {
				break;
			}
			if(input.length() != 14) {
				System.out.println("(-)을 포함하여 14자리여야 합니다.");
				continue;
			}
			if(input.split("-").length != 2) {
				System.out.println("올바른 형식이 아닙니다.");
				continue;
			}
			
			boolean isNumber = true;
			String idArr[] = input.split("-");
			for(int i = 0; i < idArr.length; i++ ) {
				for(int j = 0; j < idArr[i].length(); j++) {
					if(!(idArr[i].charAt(j) >= '0' && idArr[i].charAt(j) <= '9')){
						System.out.println("0 ~ 9 사이의 숫자이여야 합니다.");
						isNumber = false;
						break;
					}
				}
				if(!isNumber) {
					break;
				}
			}
			if(!isNumber) {
				continue;
			}
			boolean cntError = false;
			for(int i = 0; i < idArr.length; i++) {
				if(idArr[0].length() != 6 && idArr[1].length() != 7) {
					cntError = true;
					break;
				}
			}
			if(cntError) {
				System.out.println("6자리-7자리 숫자형식이여야 합니다.");
				continue;
			}
			if(idArr[1].startsWith("1") || idArr[1].startsWith("3")) {
				System.out.println("남자입니다.");
				break;
			}
			else if(idArr[1].startsWith("2") || idArr[1].startsWith("4")) {
				System.out.println("여자입니다.");
				break;
			}
		}
		sc.close();
	}
}
