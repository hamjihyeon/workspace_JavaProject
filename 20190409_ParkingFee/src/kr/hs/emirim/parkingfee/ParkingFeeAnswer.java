package kr.hs.emirim.parkingfee;

import java.util.Scanner;

public class ParkingFeeAnswer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("주차시간을 입력하세요");
		//분을 입력하자
		int time = scanner.nextInt();
		int money = 1500;
		if(time<=30) {
			//분<=30이면 1500
			System.out.println("요금은 "+money+" 원입니다.");
		}else
			//아니고,
			//	분=분-30, 요금+=155
			//	요금+=(분/10)*1000
			//	분%10!=0면, 요금+=1000
			System.out.println("요금은 "+ (((time-30)/10+1)*1000+1500)+" 원입니다.");
	}

}
