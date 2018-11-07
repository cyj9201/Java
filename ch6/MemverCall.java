// 클래스 맴버와 인스턴스 맴버간의 참조와 호출
package ch6;

class MemberCall{
	
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv 클래스변수는 인스턴스 변수를 사용할 수 없음
	static int cv2 = new MemberCall().iv; 	// 이처럼 객체를 생성해야 사용가능

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
//		instanceMethod1();		// 에러. 클래스메서드에서는 인스턴스메서드를 호출할 수 없음.
		MemberCall c = new MemberCall();
		c.instanceMethod1();
			
	}
	
	void instanceMethod2() {	// 인스턴스메서드에서는 인스턴스메서드와 클래스메서드
								// 모두 인스턴스 생성없이 바로 호출이 가능하다.
		staticMethod1();
		instanceMethod1();
	
	}
	
}


