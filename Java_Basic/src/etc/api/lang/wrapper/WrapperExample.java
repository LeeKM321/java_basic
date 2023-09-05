package etc.api.lang.wrapper;

public class WrapperExample {

	public static void main(String[] args) {

		int a = 100;
		boolean b = false;
		char c = 'A';
		double d = 3.14;

		//boxing: 기본 데이터 타입을 객체 타입으로 변환하는 과정 (권장 x)
		Integer v1 = new Integer(a);
		Boolean v2 = new Boolean(b);
		Character v3 = new Character('Z');
		Double v4 = new Double(d);

		//unboxing: 객체 타입으로 포장된 값을 기본 데이터 타입으로 풀어내는 과정 (권장 x)
		//int i = v1.intValue();

		//autoboxing: 기본 타입을 자동으로 객체형으로 변환.
		Integer x1 = a;
		Boolean x2 = false;
		Character x3 = c;
		Double x4 = d;

		//autounboxing: 객체 포장을 기본형으로 자동 해제 가능.
		int i = x1;
		double d2 = x4;

		//AutoBoxing 이후에 wrapper 클래스는 문자열을 기본형으로
		//변환하는 데 많이 사용됩니다.

		//해당 타입으로 변환할 수 없는 문자열을 시도했을 경우
		//NumberFormatException 예외가 발생합니다.
		String s2 = "3.14";
		Integer.parseInt(s2);

	}

}















