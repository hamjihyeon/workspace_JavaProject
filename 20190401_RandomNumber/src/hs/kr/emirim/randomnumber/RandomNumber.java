package hs.kr.emirim.randomnumber;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	public static void main(String ar[]) {
		
		int start = 1;
		int end = 100;

		Random random = new Random();	//start~end 랜덤숫자 뽑자
		int randomNumber = random.nextInt(end-start+1)+start;
		System.out.println(randomNumber);
		
	}
}
