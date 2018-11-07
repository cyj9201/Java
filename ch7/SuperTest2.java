// 이전예제와 비교 this.x, super.x는 서로 다른값 참조
// 같은 이름의 멤버변수를 구별하는 예제
package ch7;

public class SuperTest2 {

	public static void main(String[] args) {
		
		Child2 c = new Child2();
		c.method();
				
	}

}

class Parent2 {
	
	int x = 10;

}

class Child2 extends Parent2 {
	
	int x = 20;
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);			// 자손 클래스에 선언된 멤버변수
		System.out.println("super.x=" + super.x);		// 조상 클래스로부터 상속받은 멤버변수
		
	}
}
