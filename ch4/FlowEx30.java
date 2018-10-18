// break문
// 1부터 누적합을 구할때 100을 넘는 i의 값
package ch4;

public class FlowEx30 {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		
		while(true) {
			if(sum>100) 
				break;
			++i;
			sum += i;
		}
		
		System.out.println("i = " + i);
		System.out.println("sum = " + sum);
	}

}
