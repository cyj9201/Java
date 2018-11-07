package ch7;

public class BindingTest2 {

	public static void main(String[] args) {
	
		Parent4 p = new Child4();
		Child4  c = new Child4();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	
	}

}

class Parent4{
	
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
	
}

class Child4 extends Parent4{}		// 단순히 조상으로부터 멤버들을 상속받는다.
