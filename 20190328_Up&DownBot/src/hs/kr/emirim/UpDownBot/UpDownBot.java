package hs.kr.emirim.UpDownBot;

import java.util.Random;
import java.util.Scanner;

public class UpDownBot {

	public static void main(String[] args) {
		int start = 1;
		int end = 100;
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		while (true) {
			int guess = random.nextInt(end - start + 1) + start;
			System.out.println(guess+"입니까? (1: 정답, 2: Up, 3: Down)");
			// input(up/down/정답) 
			int answer = scanner.nextInt();
			if (answer == 1) {
				// 정답이면 정답입니다 출력
				System.out.println("정답입니다.");
				break;
			} else if (answer == 2) {
				// up이면 guess+1 ~ end
				start = guess + 1;
			} else if (answer == 3) {
				// down이면 start ~ guess-1
				end = guess - 1;
			}

		}

	}

}
