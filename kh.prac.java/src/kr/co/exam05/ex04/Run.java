package kr.co.exam05.ex04;
 
public class Run {
	public static void main(String[] args) {
		/*
		 * Speaker 클래스를 생성한 뒤
		 * 멤버 변수에는 음량, 음소거상태, 전원상태 
		 * 멤버 메서드로는 
		 * 음량키우기, 음량내리기, 음소거 상태 on/off, 전원상태 on/off, 현재상태
		 * 1. 음량은 + 5씩 커진다.
		 * 2. 음량은 - 5씩 작아진다.
		 * 3. 음소거상태 on 상태에서 음소거하면 off , 전원상태 on에서 전원 off
		 * 4. 음량은 100초과 0미만으로 조절할 수 없다.
		 * 5. 전원이 off상태면 현재상태는 "전원 OFF" / 전원on 및 음소거on이면 "음소거"/
		 * 	전원on 및 음소거off면 "음량 100(현재음량)"으로 출력되게 하는 문제.
		 */
		
		Speaker sp1 = new Speaker();
		
		sp1.togglePower();
		sp1.volumeUp();
		sp1.volumeUp();
		sp1.volumeDown();
		sp1.toggleMute();
		sp1.togglePower();
		System.out.println(sp1.getState());
	}
}
