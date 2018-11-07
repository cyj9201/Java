// 이전 예제와 달리 change매서드에 Data d(값이 저장된 주소)를 불러옴

package ch6;

public class ReferenceParamEx {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
		
	}
	
	static void change(Data d) {

		d.x = 1000;
		System.out.println("change() : x = " + d.x);
		
	}
	
}
