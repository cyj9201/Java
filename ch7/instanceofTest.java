// FireEngine클래스는 Object클래스와 Car클래스의 자손 클래스이므로 조상의 멤버들을 상속받음
package ch7;

public class instanceofTest {

	public static void main(String[] args) {
		
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		
		if(fe instanceof Car) {
			System.out.println("This is a Car instance.");
		}

		if(fe instanceof Object) {
			System.out.println("This is a Object instance.");
		}
		
		System.out.println(fe.getClass().getName());
	}

}

