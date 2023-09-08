package etc.api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {
	
	public static void main(String[] args) {
		
		System.out.println("시작!");
		
		//dummy data
		StringBuilder text = new StringBuilder();
		
		for(int i=1; i<=1000000; i++) {
			text.append(i + "안녕하세요\n");
		}
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		long start = System.currentTimeMillis();
		
		try {
			fos = new FileOutputStream("C:/MyWork/upload/bout.txt");
			bos = new BufferedOutputStream(fos);
			
			//dummy data를 StringBuilder를 사용했었음.
			//새로운 String 객체 생성 -> 생성자의 매개값으로 StringBuilder 전달
			//바이트 데이터로 변환.
			byte[] data = new String(text).getBytes();
			
			for(byte b : data) {
				bos.write(b);
			}
			
			System.out.println("파일 작성 완료!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println("소요시간: " + (end-start)*0.001 + "초");
		
		
		
	}

}












