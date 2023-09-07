package etc.generic.basic;

public class Box<T> { //제네릭 클래스로 선언
	
	private T obj;
	
	public T getObj() {
		return obj;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}

}
