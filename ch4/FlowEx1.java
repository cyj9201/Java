// 조건식의 결과는 반드시 true or false

package ch4;

public class FlowEx1 {

	public static void main(String[] args) {
		
		int x = 0;
		System.out.printf("x=%d 일때, 참인 것은%n", x);
		
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x==0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		
		x = 1;
		System.out.printf("x=%d 일때, 참인 것은%n", x);
		
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x==0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
	}

}
