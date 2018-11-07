package ch6;

class Tv3{
	// Tv의 속성(맴버변수)
	String color;
	boolean power;
	int channel;
			
	// Tv의 기능(매서드)
	void power()	   {power = !power;}
	void channelUp()   {++channel;}
	void channelDown() {--channel;}
}

public class TvTest3 {

	public static void main(String[] args) {
		
		Tv3 t1 = new Tv3();
		Tv3 t2 = new Tv3();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t2 = t1;		// t2가 참조하고 있던 인스턴스는 사용할 수 없고 t2는 t1의 인스턴스를 같이 참조하게 된다.
		t1.channel = 7;
		System.out.println("t1의 channel값을 " + t1.channel + "로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t1의 channel값은 " + t2.channel + "입니다.");
	
	}

}