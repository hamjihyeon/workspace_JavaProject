package kr.hs.emirim.updown;

import java.util.Random;
import java.util.Scanner;

public class UpDown {

	public static void main(String[] args) {
		Random random = new Random();
		int answer = random.nextInt(100) + 1;
		System.out.println("컴퓨터가 생각하는 숫자를 입력하세요(1~100)");
		while (true) {
			Scanner scanner = new Scanner(System.in);
			int player = scanner.nextInt();

			if (answer > player) {
				System.out.println("UP");
			} else if (answer < player) {
				System.out.println("Down");
			} else {
				System.out.println("정답입니다.");
				break;
			}
		}
	}

}