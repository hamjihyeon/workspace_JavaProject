package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLRead {

	public static void main(String[] args) {
		try {
			//URL 객체 생성
			URL aURL = new URL("https://www.naver.com");
			
			//URL 객체에서 입력 스틂 생성
			BufferedReader in = new BufferedReader(new InputStreamReader(aURL.openStream()));
			String inputLine;
			
			while ((inputLine = in.readLine()) != null)	//한행 씩 읽음
				System.out.println(inputLine);
			in.close();
		} catch (IOException e) {
			System.out.println("URL에서 데이터를 읽는 중 오류가 발생했습니다.");
		}
	}

}
