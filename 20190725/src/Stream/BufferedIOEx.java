package Stream;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedIOEx {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
		try {
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
			out.flush();	//버퍼에 남아 있던 문자 출력
			if (in != null) {
				in.close();
				out.close();
			} 
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
