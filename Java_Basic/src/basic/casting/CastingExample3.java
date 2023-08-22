package basic.casting;

public class CastingExample3 {

	public static void main(String[] args) {
		
		char c = 'B';
		int i = 2;
		
		// 서로 타입이 다른 기본 데이터의 연산 시에는 데이터 타입이 큰 쪽에
		// 작은 쪽이 맞춰져서 자동으로 형 변환이 진행된 뒤에 연산이 진행됩니다.
		
		int intResult = c + i;
		char charResult = (char) (c + i);
		System.out.println(intResult);
		System.out.println(charResult);
		
		int k = 10;
		double d = (double) k / 4;
		System.out.println(d);
		
		//int보다 작은 크기의 데이터 연산은 자동으로 값이
		//int로 변환되어 처리됩니다. (데이터 손실의 방지)
		byte b1 = 100;
		byte b2 = 70;
		System.out.println(b1 + b2);
		
		
		

	}

}













