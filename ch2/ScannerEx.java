
package ch2;

import java.util.Scanner; // Scanner를 사용하기위해 추가

public class ScannerEx {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("세자리 정수를 입력하시오>>");
		String input = scanner.nextLine();
		scanner.close();
		
		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
		System.out.println("입력내용 : " + input);
		System.out.printf("result = %d%n", num);
		
	}

}
