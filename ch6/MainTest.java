// main 매서드도 자기 자신 호출 가능
// 호출스택의 메모리 한계를 넘게 되어 비정상적으로 에러 종료

package ch6;

public class MainTest {

	public static void main(String[] args) {
		
		main(null);

	}

}
