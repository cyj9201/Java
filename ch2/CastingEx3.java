package ch2;

public class CastingEx3 {

	public static void main(String[] args) {
		float  f  = 9.1234567f;
		double d  = 9.1234567;
		double d2 = (double)f;
		
		System.out.printf("f =%20.18f\n", f);		// ���� ���� �����ص� float�� double�� ���е� ����
		System.out.printf("d =%20.18f\n", d);		// ������ ���� �ٸ� ���� ����
		System.out.printf("d2=%20.18f\n", d2);
				
	}

}
