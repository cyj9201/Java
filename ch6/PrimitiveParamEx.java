// d.x 값을 1000으로 변경해도 main 매서드에는 변하지않음

package ch6;

class Data { int x; }

public class PrimitiveParamEx {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change (d.x)");
		System.out.println("main() : x = " + d.x);
		
	}
	
	static void change(int x) {
	
		x = 1000;
		System.out.println("change() : x = " + x);
		
	}

}
