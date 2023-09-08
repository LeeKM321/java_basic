package etc.inner;

public class AddCalculator implements Calculator {

	@Override
	public int operate(int n1, int n2) {
		return n1 + n2;
	}

}
