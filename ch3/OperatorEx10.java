package ch3;

public class OperatorEx10 {

	public static void main(String[] args) {

		int a = 1000000;
		
		int result1 = a * a / a;		// 1000000 * 1000000 / 1000000
		int result2 = a / a * a;		// 1000000 / 1000000 * 1000000
		
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);		// 먼저 곱하기 때문에 int의 범위를 넘어선다(Overflow 발생)
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result2);
		
	}

}
