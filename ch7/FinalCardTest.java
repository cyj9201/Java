// �����ڸ� �̿��� final��� ������ �ʱ�ȭ
package ch7;

class Card3 {
	
	final int NUMBER;		// ������� ����� �Բ� �ʱ�ȭ ���� �ʰ�
	final String KIND;		// �����ڿ��� �� �ѹ��� �ʱ�ȭ�� �� �ִ�.
	static int width = 100;
	static int height = 250;
	
	Card3(String kind, int num){
		
		KIND = kind;		// �Ű������� �Ѱܹ��� ������ KIND�� NUMBER�� �ʱ�ȭ�Ѵ�.
		NUMBER = num;
		
	}
	
	Card3(){
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}

public class FinalCardTest {

	public static void main(String[] args) {

		Card3 c = new Card3("HEART", 10);
// 		c.NUMBER = 5; 					���� �߻�
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);		

	}

}
