// Ŭ���� �ɹ��� �ν��Ͻ� �ɹ����� ������ ȣ��
package ch6;

class MemberCall{
	
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv Ŭ���������� �ν��Ͻ� ������ ����� �� ����
	static int cv2 = new MemberCall().iv; 	// ��ó�� ��ü�� �����ؾ� ��밡��

	static void staticMethod1() {

		System.out.println(cv);
		MemberCall c = new MemberCall();
		System.out.println(c.iv);
	
	}
	
	void instanceMethod1() {
		
		System.out.println(cv);
		System.out.println(iv);
	
	}
	
	static void staticMethod2() {
		
		staticMethod1();
//		instanceMethod1();		// ����. Ŭ�����޼��忡���� �ν��Ͻ��޼��带 ȣ���� �� ����.
		MemberCall c = new MemberCall();
		c.instanceMethod1();
			
	}
	
	void instanceMethod2() {	// �ν��Ͻ��޼��忡���� �ν��Ͻ��޼���� Ŭ�����޼���
								// ��� �ν��Ͻ� �������� �ٷ� ȣ���� �����ϴ�.
		staticMethod1();
		instanceMethod1();
	
	}
	
}

