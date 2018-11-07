// 생성자의 접근 제어자
// 생성자의 접근 제어자를 private으로 지정하면, 외부에서 생서자에 접근할 수 없으므로 인스턴스를 생서할 수 없게 된다.

package ch7;

final class Singleton{
	
	private static Singleton s = new Singleton();
	
	private Singleton() {
		//...
	}
	
	public static Singleton getInstance() {
		if(s==null)
			s = new Singleton() ;
		
		return s;
	}
	
}

public class SingletonTest {

	public static void main(String[] args) {
		
// singleton s = new Singleton() ;  *Error: private access in Singleton
		Singleton s = Singleton.getInstance();
		
	}

}
