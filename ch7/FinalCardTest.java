// 생성자를 이용한 final멤버 변수의 초기화
package ch7;

class Card3 {
	
	final int NUMBER;		// 상수지만 선언과 함께 초기화 하지 않고
	final String KIND;		// 생성자에서 단 한번만 초기화할 수 있다.
	static int width = 100;
	static int height = 250;
	
	Card3(String kind, int num){
		
		KIND = kind;		// 매개변수로 넘겨받은 값으로 KIND와 NUMBER을 초기화한다.
		NUMBER = num;
		
	}
	
	Card3(){
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}

public class FinalCardTest {

	public static void main(String[] args) {

		Card3 c = new Card3("HEART", 10);
// 		c.NUMBER = 5; 					에러 발생
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);		

	}

}
