package hs.kr.emirim.game369;

//1~99까지
//숫자에 3, 6, 9가 있으면 "짝"을
//아니면 숫자를 출력한다.
public class Game369 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			// 숫자 -> 문자열
			String numberString = String.valueOf(i);
			// 하나씩 떼서 '3' 또는 '6' 도는 '9'의 개수를 센다
			int count = count369(numberString);
			if (count == 0) {
				// 개수가 0이면, 그냥 숫자출력
				System.out.println(i);
			} else {
				// 아니면,
				// 개수대로 '짝' 출력
				for (int j = 0; j < count; j++) {
					System.out.print("짝");
				}
				System.out.println();
			}

		}

	}

	private static int count369(String numberString) {
		// 0~length-1까지
		// 문자를 하나씩 구하고
		// 그 문자가 '3' 또는 '6' 또는 '9'이면 짝
		int sum = 0;
		for(int i = 0; i<numberString.length(); i++){
			char ch = numberString.charAt(i);
			if (ch == '3' || ch == '6' || ch == '9') {
				sum++;
			}
		}

		return sum;
	}

}
