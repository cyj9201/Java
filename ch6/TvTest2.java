// Tv클래스의 인스턴스 t1,t2 생성 후 인스턴스 t1의 맴버변수인 channel의 값을 변경
// 같은 패키지 안에 같은 클래스이름을 지정 시 에러메세지 발생(스크립트 결과는 나옴)
package ch6;

class Tv2{
	// Tv의 속성(맴버변수)
	String color;
	boolean power;
	int channel;
			
	// Tv의 기능(매서드)
	void power()	   {power = !power;}
	void channelUp()   {++channel;}
	void channelDown() {--channel;}
}

public class TvTest2 {

	public static void main(String[] args) {
		
		Tv2 t1 = new Tv2();
		Tv2 t2 = new Tv2();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t1.channel = 7;
		System.out.println("t1의 channel값을 " + t1.channel + "로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t1의 channel값은 " + t2.channel + "입니다.");
	
	}

}
