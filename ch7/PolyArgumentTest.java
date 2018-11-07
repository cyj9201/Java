// 매개변수의 다형성
// 고객이 buy매서드를 이용해서 Tv와 Computer를 구입하고, 고객의 잔고와 보너스 점수를 출력하는 예제이다.
package ch7;

class Product{
	
	int price;
	int bounsPoint;
	
	Product(int price){
		this.price = price;
		bounsPoint = (int)(price/10.0);		// 보너스점수는 제품가격의 10%
	}
	
}

class Tv3 extends Product{

	Tv3(){
		// 조상클래스의 생성자 Product를 호출한다.
		super(100);		// Tv의 가격을 100만원으로 한다.
	}
	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() { return "TV"; }
	
}

class Computer extends Product {

	Computer() { super(200); }
	public String toString() { return "Computer"; }
	
}

class Buyer{		// 고객, 물건을 사는 사람

	int money = 1000;		// 소유금액
	int bounsPoint = 0;		// 보너스점수
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;			// 가진 돈에서 구입한 제품의 가격을 뺀다.
		bounsPoint += p.bounsPoint; // 제품의 보너스 점수를 추가한다.
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
}

public class PolyArgumentTest {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
		b.buy(new Tv3());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 "+ b.bounsPoint + "점입니다.");

	}

}
