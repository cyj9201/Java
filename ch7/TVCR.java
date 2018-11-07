// 단일 상속
// Java는 다중 상속을 허용하지 않는다.
package ch7;

class Tv2{

	boolean power;		// 전원상태(on, off)
	int channel;		// 채널
	
	void power()	    { power = !power; }
	void channelUp()	{ ++channel; }
	void channelDown()	{ --channel; }

}

class VCR {
	
	boolean power;		// 전원상태(on/off)
	int counter = 0;
	void power() { power = !power; }
	void play()	 { /*내용 생략*/ }
	void stop()  { /*내용 생략*/ }
	void rew()   { /*내용 생략*/ }
	void ff()    { /*내용 생략*/ }

}

public class TVCR extends Tv2{
	
	VCR vcr = new VCR();
	int counter = vcr.counter;
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.play();
	}
	
	void rew() {
		vcr.play();
	}
	
	void ff() {
		vcr.play();
	}
	
	
}
