// TvŬ������ �ν��Ͻ� t1,t2 ���� �� �ν��Ͻ� t1�� �ɹ������� channel�� ���� ����
// ���� ��Ű�� �ȿ� ���� Ŭ�����̸��� ���� �� �����޼��� �߻�(��ũ��Ʈ ����� ����)
package ch6;

class Tv2{
	// Tv�� �Ӽ�(�ɹ�����)
	String color;
	boolean power;
	int channel;
			
	// Tv�� ���(�ż���)
	void power()	   {power = !power;}
	void channelUp()   {++channel;}
	void channelDown() {--channel;}
}

public class TvTest2 {

	public static void main(String[] args) {
		
		Tv2 t1 = new Tv2();
		Tv2 t2 = new Tv2();
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		
		t1.channel = 7;
		System.out.println("t1�� channel���� " + t1.channel + "�� �����Ͽ����ϴ�.");
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t1�� channel���� " + t2.channel + "�Դϴ�.");
	
	}

}
