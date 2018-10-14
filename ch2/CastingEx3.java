package ch2;

public class CastingEx3 {

	public static void main(String[] args) {
		float  f  = 9.1234567f;
		double d  = 9.1234567;
		double d2 = (double)f;
		
		System.out.printf("f =%20.18f\n", f);		// 같은 값을 저장해도 float와 double의 정밀도 차이
		System.out.printf("d =%20.18f\n", d);		// 때문에 서로 다른 값이 저장
		System.out.printf("d2=%20.18f\n", d2);
				
	}

}
