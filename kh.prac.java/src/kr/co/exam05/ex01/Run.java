package kr.co.exam05.ex01;

public class Run {

	public static void main(String[] args) {
	/*
	 * 펜(Pen) 객체를 클래스로 만들어 보시오. 
	 */
	
	/*
	 * 신발(Shoes) 객체를 클래스로 만들어 보시오. 
	 */
		
		Pen pen = new Pen();
		pen.brand = "모나미";
		pen.type = "컴퓨터용싸인펜";
		pen.ballSize = 0.5;
		pen.color = "Black";
		pen.price = 2000;
		
		System.out.println("===== Pen =====");
		System.out.printf("브랜드 : %s\n타입 : %s\n볼사이즈 : %.1f\n컬러 : %s\n가격 : %d\n", 
				pen.brand, pen.type, pen.ballSize, pen.color, pen.price);
		
		Shoes shoes = new Shoes();
		shoes.brand = "MLB";
		shoes.type = "어글리슈즈";
		shoes.color = "Black";
		shoes.size = 265;
		shoes.price = 99000;
		
		System.out.println("===== Shoes =====");
		System.out.printf("브랜드 : %s\n타입 : %s\n컬러 : %s\n사이즈 : %s\n가격 : %s\n",
				shoes.brand, shoes.type, shoes.color, shoes.size, shoes.price);
		
		}

}
