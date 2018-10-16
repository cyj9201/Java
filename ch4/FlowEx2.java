// 블럭{}

package ch4;

import java.util.*;

public class FlowEx2 {

	public static void main(String[] args) {
		
		int input;
		System.out.print("숫자를 하나 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();		// 화면을 토애 입력받은 내용을 tmp에 저장
		input = Integer.parseInt(tmp);			// 입력받은 문자열(tmp)를 숫자로 변환
		scanner.close();
		
		if(input == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}		
		
		if(input != 0) {
			System.out.println("입력하신 숫자는 0이 아닙니다.");			// 블럭{}을 생략했기 때문에 3번째 printf문이 항상 출력된다.
			System.out.printf("입력하신 숫자는 %d입니다.", input);
		}
	}

}
