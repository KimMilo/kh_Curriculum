package kr.co.exam01;

public class Exam01 {
	public static void main(String[] args) {
		System.out.println("1. 변수 저장 및 출력");
		// 1. 문자열 변수 name에 본인의 이름을 저장
		String name = "홍길동";
		
		// 2. 정수 변수 age에 자신의 나이를 저장
		short age = 35;
		
		// 3. 실수 변수 tall에 자신의 키를 저장
		double tall = 174.6;
		
		// 4. 변수에 저장된 모든 값을 .println() 함수로 출력하세요.
		System.out.println("내 이름은 : " + name);
		System.out.println("내 나이는 : " + age);
		System.out.println("내 키는 : " + tall);
	
		System.out.println("==========================================");
		// 5. 변수에 저장된 값을 활용하여 다음 형식에 맞추어 출력하세요.
		//		형식에 맞추어 출력 할 때 .print() / .printf() / .println() 중
		//		자신이 사용하기 편한 함수 하나를 선택하여 출력하세요.
		// 		형식: 저의 이름은 홍길동 입니다. 올해 30세 이며, 내년에는 31세가 됩니다.
		
		System.out.println("2. 출력방식");
		String name2= "임꺽정";
		int age2 = 20;
		//int nextYearAge = age2 + 1;
		
		// .print()
		System.out.println("2-1 .print()");
		System.out.print("저의 이름은 " + name2 + "입니다. " + "올해 " + age2 + "세이며, "
				+ "내년에는 " + (age2+1) + "세가 됩니다.\n");
				
		// .printf()
		System.out.println("2-2 .printf()");
		System.out.printf("저의 이름은 %s입니다. 올해 %d세이며, 내년에는 %d세가 됩니다.\n", 
				name2, age2, age2+1);
		
		
		// .println()
		System.out.println("2-3 .pritln()");
		System.out.println("저의 이름은 " + name2 + "입니다. " + "올해 " + age2 + "세이며, "
						+ "내년에는 " + (age2+1) + "세가 됩니다.");
	}
}