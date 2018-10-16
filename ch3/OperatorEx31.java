// 쉬프트, 비트AND 연산자를 이용해서 16진수를 끝에서부터 한자리씩 뽑아내는 예제이다.
package ch3;

public class OperatorEx31 {

	public static void main(String[] args) {
		
		int dec  = 1234;
		int hex  = 0xABCD;
		int mask = 0xF;
		
		System.out.printf("hex=%X%n", hex);
		System.out.printf("%X%n", hex & mask); 
		
		hex = hex >> 4;							 	// SHIFT 연산자
		System.out.printf("%X%n", hex & mask);		// 비트 AND 연산자
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		
	}

}
