// FireEngineŬ������ ObjectŬ������ CarŬ������ �ڼ� Ŭ�����̹Ƿ� ������ ������� ��ӹ���
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

