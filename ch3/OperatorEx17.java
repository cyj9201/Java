// 소수점 넷째짜리에서 반올림하는 방법
package ch3;

public class OperatorEx17 {

	public static void main(String[] args) {
		
		double pi = 3.141592;
		double shortPi = (int)(pi * 1000 +0.5) / 1000.0;	// 반올림을 위해 0.5 더하기
		
		System.out.println(shortPi);

	}

}
