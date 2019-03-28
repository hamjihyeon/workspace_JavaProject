package kr.hs.emirim.updown;

import java.util.Random;
import java.util.Scanner;

public class UpDown {

	public static void main(String[] args) {
		Random random = new Random();
		int rNumber = random.nextInt(100);
		rNumber += rNumber;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int an = scanner.nextInt();
			if (rNumber == an) {
				System.out.println("끝");
				break;
			} else if (rNumber < an) {
				System.out.println("DOWN");
			} else {
				System.out.println("UP");
			}
		}

	}

}