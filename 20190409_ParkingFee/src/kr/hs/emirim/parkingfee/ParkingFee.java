//분을 입력받아
//최초 30분은 2000원, 10분당 1000원
//주차요금 출력하자
//5 -> 2000, 30 -> 2000, 40 -> 3000, 41 -> 4000

package kr.hs.emirim.parkingfee;

public class ParkingFee {

	public static void main(String[] args) {
		int fee;
		// 분을 입력받자
		int parkingMinutes = 5;
		// 0이상 30분 이하면 2000
		if (0 <= parkingMinutes && parkingMinutes <= 30) {
			fee = 2000;
		} else {
			// 봄's 의견
			// (십의 자리 -1)x2000 + (일의자리가 1이상이면)1000
			int 십의자리 = parkingMinutes / 10;
			int 일의자리 = parkingMinutes % 10;
			fee = (십의자리 - 1) * 1000;
			if (일의자리 >= 1) 
				fee += 1000;
			}
		System.out.println(fee + " 원");
			// 30분 초과 40분 이하면 3000
			// 40분 초과 50분 이하면 4000
			// 50분 초과 60분 이하면 5000


	}
}
