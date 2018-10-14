package ch3;

public class OperatorEx13 {

	public static void main(String[] args) {
		
		char c1 = 'a';
		
//		char c2 = c1 + 1;		// line 5 : 컴파일 에러발생!!!
		char c2 = 'a'+ 1;		// line 6 : 컴파일 에러없음

		System.out.println(c2);
	}

}
