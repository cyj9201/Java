// time 클래스의 모든 멤버변수의 접근 제어자를 private으로 하고, 이 들을 다루기 위한 public 매서드 추가
package ch7;

public class TimeTest {

	public static void main(String[] args) {
		
		Time t = new Time(12, 35, 30);
		System.out.println(t);
//		t.hour = 13;
		t.setHour(t.getHour()+1);
		System.out.println(t);
				
	}

}

class Time {
	private int hour, minute, second;
	
	Time(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() { return hour; }
	public void setHour(int hour) {
		if (hour < 0 || hour > 23) return;
		this.hour = hour;
	}
	
	public int getMinute() { return minute; }
	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) return;
		this.minute = minute;
	}
	
	public int getSecond() { return second; }
	public void setSecond(int second) {
		if (second < 0 || second > 59) return;
		this.second = second;
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second;
	
	}
}
