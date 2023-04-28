package kr.co.exam10.ex01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Exam02 {
	/* HashSet 사용
	 * 로또 번호 생성
	 * 		- 1 ~ 45 까지의 랜덤 번호를 생성하여 리스트에 담는다.
	 *		- 중복된 값 없이 리스트에 담도록 한다.
	 *		- 총 6개의 정수값이 리스트에 저장될 수 있도록 한다.
	 *		- 마지막에 출력할 때 오름차순으로 정렬이 되도록 한다.
	 */

	/*
	 * 위에서 생성한 로또 번호 6개를 1세트라고 하자.
	 * 
	 * 1. 사용자가 원하는 수의 세트로 로또 번호가 생성되어 파일에 저장 될 수 있도록 한다.
	 * 2. 저장할 때 D:\\에 lotto.txt 파일로 저장되도록 한다.
	 * 3. 한 줄에 1세트의 번호가 출력되어야 한다.
	 */
	
	
	public static HashSet<Integer> getLottoNumber(){
		HashSet<Integer> numbers = new HashSet<Integer>();
		Random rand = new Random();
		while(numbers.size() < 6) {
			int num = rand.nextInt(45) + 1;
			Integer i = Integer.valueOf(num);
			numbers.add(i);
					
		}
		return numbers;
	}

	public static void main(String[] args) {
		
		File f = new File("D:\\lotto.txt");
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f))){
			Scanner sc = new Scanner(System.in);
			System.out.print("원하는 세트 수 입력 : ");
			int setCount = sc.nextInt();
			for(int i = 0; i < setCount; i++) {
				ArrayList<Integer> numbers = new ArrayList<Integer>(getLottoNumber());
				Collections.sort(numbers);
				String[] sArr = new String[numbers.size()];
				for(int n = 0; n < sArr.length; n++) {
					sArr[n] = numbers.get(n).toString();
				}
				bw.write(String.join(", ", sArr));
				bw.newLine();
			}
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}