package kr.hs.emirim.echo;

import java.util.Scanner;

public class echo {

	public static void main(String[] args) {
		// 반복
		// input
		// 변수에 대입
		// 변수 대입
		System.out.println("아무거나 입력하세요. 그만하고 싶다면 exit를 누르세요.");
		while (true) {
			Scanner scanner = new Scanner(System.in);
			String inputString = scanner.nextLine();
			if(inputString.equals("exit")) {
				System.out.println("안녕, 잘가");
				break;
			}
			System.out.println(inputString);
		}
	}

}