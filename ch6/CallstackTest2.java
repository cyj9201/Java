// ȣ����� Ȯ���ϴ� ����

package ch6;

public class CallstackTest2 {

	public static void main(String[] args) {
		
		System.out.println("main(String[] arg)�� ���۵Ǿ���.");
		firstMethod();
		System.out.println("main(String[] arg)�� ������.");
		
	}
	
	static void firstMethod() {
		System.out.println("firstMethod()�� ���۵Ǿ���");
		secondMethod();
		System.out.println("firstMethod()�� ������");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()�� ���۵Ǿ���");
		System.out.println("secondMethod()�� ������");
		
	}

}
