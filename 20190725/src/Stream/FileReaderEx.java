package Stream;

import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) {
		FileInputStream fin = null;
		InputStreamReader in = null;
		try {
			//파일로부터 문자 입력 스트림 생성 
			//in = new FileReader("c:\\windows\\system.ini");
			fin = new FileInputStream("d:\\hangul.txt");
			in = new InputStreamReader(fin, "MS949");
				int c;
				while((c = in.read())!= -1) {	//한 문자씩 읽는다.
					System.out.print((char)c);
				}
				in.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
