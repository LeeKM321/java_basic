package etc.api.lang.stringbuilder;

public class StrTest {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		/*
		//String test
		String str = "a";
		for(int i=1; i<=500000; i++) {
			str += "a";
		}
		*/
		
		StringBuilder sb = new StringBuilder("a");
		for(int i=1; i<=500000; i++) {
			sb.append("a");
		}
		

		long end = System.currentTimeMillis();

		System.out.println("실행 결과: " + (end-start)*0.001 + "초");

	}

}
