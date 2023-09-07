package etc.api.io.rw;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {

		/*
		 - 문자기반으로 읽어들이는 클래스는 FileReader 입니다.
		 - 2바이트 단위로 읽기 때문에 문자를 읽어들이기 적합합니다.
		 */
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("C:/MyWork/test.txt");
			
			char[] arr = new char[50];
			
			//read() 메서드에 배열을 전달하지 않으면 한 글자씩 읽어들임.
			//배열을 전달하면 배열의 크기만큼 읽어들임.
			int result = fr.read(arr);
			System.out.println("문자의 개수: " + result);
			for(char c : arr) {
				System.out.print(c);
				if(c == 0) break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}










