// Tv클래스로부터 상속받고 기능을 추가하여 CaptionTv 클래스를 작성한 예제
package ch7;

class Tv{

	boolean power;	// 전원상태(on/off)
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
		ctv.channel = 10;			// 조상 클래스로부터 상속받은 멤버
		ctv.channelUp();			// 조상 클래스로부터 상속받은 멤버
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true;
		ctv.displayCaption("Hello, World");
	
	}
	
}
