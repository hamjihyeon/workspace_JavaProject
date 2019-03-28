import java.util.Scanner;

public class Page {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int page = 7;
		System.out.println("전체 페이지를 입력하세요(한 페이지당 게시물 7개)");
		

		for (;;) {
			int whole = sc.nextInt();
			if (whole % 7 == 0) {
				System.out.println(whole / 7 + " 페이지");
			} else{
				System.out.println(whole / 7 + 1 + " 페이지");
			}
		}
	}

}
