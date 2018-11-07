// 참조변수와 인스턴스의 연결

package ch7;

public class BindingTest {

	public static void main(String[] args) {
		
		Parent3 p = new Child3();		//	참조변수 p, c 모두 Child3 인스턴스를 참조
		Child3  c = new Child3();		// 
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("p.x = " + p.x);
		c.method();
	
	}

}

class Parent3 {
	
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}

}

class Child3 extends Parent3 {
	
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
	
}



