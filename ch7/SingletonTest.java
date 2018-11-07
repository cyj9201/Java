// �������� ���� ������
// �������� ���� �����ڸ� private���� �����ϸ�, �ܺο��� �����ڿ� ������ �� �����Ƿ� �ν��Ͻ��� ������ �� ���� �ȴ�.

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
