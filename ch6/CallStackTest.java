// 객체를 생성하지 않고 매서드 호출(static 추가)

package ch6;

public class CallStackTest {

	public static void main(String[] args) {
		firstMethod();
	}

	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
	
}
