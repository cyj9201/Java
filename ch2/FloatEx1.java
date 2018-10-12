package ch2;

public class FloatEx1 {

	public static void main(String[] args) {
		
		float f  = 9.1234567890123456789f;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890;
		
		System.out.printf("     123456789012345678901234%n");
		System.out.printf("f  : %f%n", f);		// 소수점 이하 6번째 자리까지 출력
		System.out.printf("f  : %24.20f%n", f); // 저장공간의 한계로 인하여 실제로 저장된 값이 달라진다.
		System.out.printf("f2 : %24.20f%n", f2);
		System.out.printf("d  : %24.20f%n", d);
		

	}

}
