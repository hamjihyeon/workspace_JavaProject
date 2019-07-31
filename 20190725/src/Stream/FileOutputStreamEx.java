package Stream;

import java.io.*;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("d:\\test.txt");
			FileInputStream fin = null;
			
			for(int i = 0; i<10; i++) {
				int n = 10-i;
				fout.write(n);
			}
			fout.close();
			
			fin = new FileInputStream("d:\\test.txt");
			int c = 0;
			while((c = fin.read()) != -1) {
				System.out.print(c+ " ");
			}
			fin.close();
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println("입출력 오류");
		}
	}

}
