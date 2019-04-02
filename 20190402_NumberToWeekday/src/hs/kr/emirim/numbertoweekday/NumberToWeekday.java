package hs.kr.emirim.numbertoweekday;

import java.util.Scanner;

public class NumberToWeekday {

	public static void main(String[] args) {
		String[] weekdays = {"월", "화", "수", "목", "금", "토", "일"};
		
		// 숫자입력하자
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하면 요일이 나와요.");
		int inputNumber = scanner.nextInt();
		//요일 입력하자	(1:월요일, 2:화요일, 3:수요일, ... , 7:일요일)
		System.out.println(weekdays[inputNumber-1]+"요일");


	}

}
