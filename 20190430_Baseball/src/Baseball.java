import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		//*정답 만들자
		//	1~9까지 랜덤숫자 3번 뽑자. 단, 중복ㅇ없이
		String c = "416";
		
		//무한반복
		while(true) {
		//	1~9까지 세자리 숫자 입력하자
		Scanner sc = new Scanner(System.in);
		String p = sc.nextLine();
		//*strike, ball 구하자
		boolean isEnd = play(p, c);
		if(isEnd == true) {
			System.out.println("Hit");
			break;
			}
		}
	}

	private static boolean play(String p, String c) {
		int strike = 0;
		int ball = 0;
		//	for i 사용자인덱스 돌고
		for(int i = 0; i<p.length(); i++) {
			//		for j 컴퓨터 인덱스 돌고
			for(int j = 0; j<c.length(); j++) {
				if(p.charAt(i) == c.charAt(j)) {
					if(i == j) strike++;
					else ball++;
				}
			}
			
		}
		//	p, strike, ball 출력하자
		System.out.println(p + "\tstrike: " + strike+"\tball: "+ ball);
		//	strike == 입력한 문자열 길이만큼 나오면, Hit
		return false;
	}

}
