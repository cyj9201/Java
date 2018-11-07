// super
// 자손 클래스에서 조상 클래스로부터 상속받은 맴배를 참조하는데 사용되는 참조 변수
package ch7;

public class SuperTest {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.method();
				
	}

}

class Parent {
	
	int x = 10;

}

class Child extends Parent {

	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);			// 조상의 맴버, 자신의 맴버를 구별(this, super)
		System.out.println("super.x=" + super.x);

	}
}
