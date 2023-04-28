package kr.co.exam12.ex02;

public class Run {
	public static void main(String[] args) {
		Lotto lotto = new Lotto(1);
		
		lotto.generate();
		System.out.println(lotto.getLotto());
	}
}
