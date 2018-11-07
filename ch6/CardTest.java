// 클래스변수와 인스턴스변수의 차이

package ch6;

public class CardTest {

	public static void main(String[] args) {
		
		System.out.println("Card.width = " + Card.width);		//클래스변수(static 변수)는 객체생성 없이 'class이름.class변수'로 사용가능
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();	
		c2.kind = "Spade";		// 인스턴스 값 변경
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number +"이며, 크기는(" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2은 " + c2.kind + ", " + c2.number +"이며, 크기는(" + c2.width + ", " + c2.height + ")" );
		System.out.println("c1의 width와 height를 각각 50, 80,으로 변경합니다.");
		
		c1.width = 50;
		c1.height = 80;
		System.out.println("c1은 " + c1.kind + ", " + c1.number +"이며, 크기는(" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2은 " + c2.kind + ", " + c2.number +"이며, 크기는(" + c2.width + ", " + c2.height + ")" );
				
	}

}

class Card{
	
	// 인스턴스 변수(서로 독립된 저장공간)
	String kind;
	int number;
	// 클래스 변수(모든 인스턴스가 공통된 저장공간(변수)을 공유)
	static int width = 100;
	static int height = 100;
	
}

