// 1부터 누적합을 구할때 누적합계가 100을 넘지 않는 제일 큰 수 

package ch4;

public class FlowEx26 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i   = 0;
		
		// i를 1씩 증가시켜서 sum에 계속 더해나간다.
		while((sum += ++i) <100) {
			System.out.printf("i = %d 일때 sum = %d%n", i, sum);
		}
		
	}

}
