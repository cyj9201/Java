// TvŬ�����κ��� ��ӹް� ����� �߰��Ͽ� CaptionTv Ŭ������ �ۼ��� ����
package ch7;

class Tv{

	boolean power;	// ��������(on/off)
	int   channel;
	
	void power()		{ power = !power; }
	void channelUp()	{ ++channel; }
	void channelDown()	{ --channel; }

}

class CaptionTv extends Tv {

	boolean caption;
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
	
}

public class CaptionTvTest {

	public static void main(String[] args) {
		
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;			// ���� Ŭ�����κ��� ��ӹ��� ���
		ctv.channelUp();			// ���� Ŭ�����κ��� ��ӹ��� ���
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true;
		ctv.displayCaption("Hello, World");
	
	}
	
}
