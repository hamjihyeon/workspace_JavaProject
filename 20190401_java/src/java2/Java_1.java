package java2;

import java.util.Scanner;

public class Java_1 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하면 짝/홀이 나옵니다.");
		int a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println("짝수입니당.");
		} else
			System.out.println("홀수입니당.");
	}
}
