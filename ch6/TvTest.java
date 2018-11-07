// 클래스로 부터 인스턴스를 생성하는 방법

package ch6;

class Tv{
	// Tv의 속성(맴버 변수)
	String color;
	boolean power;
	int channel;
	
	// Tv의 기능(매서드)
	void power() { power = !power;}		// Tv 전원 on/off 매서드
	void channelUp() { ++ channel;}		// Tv 채널 높이는 매서드
	void channelDown() {-- channel;}	// Tv 채널 낮추는 매서드
}

public class TvTest {

	public static void main(String[] args) {

		Tv t;					// Tv인스턴스를 참조하기 위한 변수 t 선언
		t = new Tv();			// Tv인스턴스를 생성한다.
		t.channel = 7;			// Tv인스턴스의 맴버변수 channel 값을 7로 설정
		t.channelDown();		// Tv인스턴스의 매서드 호출
		System.out.println("현재 채널은 " + t.channel + " 입니다.");
				
	}

}
