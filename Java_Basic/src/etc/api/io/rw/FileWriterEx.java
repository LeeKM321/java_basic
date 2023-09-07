package etc.api.io.rw;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	
	public static void main(String[] args) {
		
		/*
		 - 문자를 써서 저장할 때 사용하는 클래스 FileWriter 입니다.
		 - 기본적으로 2바이트 단위로 처리하기 때문에 문자 쓰기에 적합합니다.
		 */
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("C:/MyWork/merong.txt");
			
			// \r: 캐리지 리턴 -> 커서를 맨 앞으로 땡기는 동작.
			// \n: 줄 개행(줄바꿈)
			// 상황과 환경에 따라서 줄 개행 시 커서를 맨 앞으로 안땡겨주는 경우가 있습니다.
			String str = "오늘은 9월 7일입니다.\r\n목요일입니다.\r\n왜 금요일 아냐?";
			
			fw.write(str);
			
			System.out.println("파일 정상 저장 완료!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}









