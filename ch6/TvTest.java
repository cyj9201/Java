// Ŭ������ ���� �ν��Ͻ��� �����ϴ� ���

package ch6;

class Tv{
	// Tv�� �Ӽ�(�ɹ� ����)
	String color;
	boolean power;
	int channel;
	
	// Tv�� ���(�ż���)
	void power() { power = !power;}		// Tv ���� on/off �ż���
	void channelUp() { ++ channel;}		// Tv ä�� ���̴� �ż���
	void channelDown() {-- channel;}	// Tv ä�� ���ߴ� �ż���
}

public class TvTest {

	public static void main(String[] args) {

		Tv t;					// Tv�ν��Ͻ��� �����ϱ� ���� ���� t ����
		t = new Tv();			// Tv�ν��Ͻ��� �����Ѵ�.
		t.channel = 7;			// Tv�ν��Ͻ��� �ɹ����� channel ���� 7�� ����
		t.channelDown();		// Tv�ν��Ͻ��� �ż��� ȣ��
		System.out.println("���� ä���� " + t.channel + " �Դϴ�.");
				
	}

}
