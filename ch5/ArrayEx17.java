// 화면으로 사칙연산을 수행하는 수식을 입력받아서 계산하여 그 결과를 보여주는 예제
// cmd창에서 인수받아서 실행

package ch5;

public class ArrayEx17 {

	public static void main(String[] args) {
		
		if(args.length !=3) {
			System.out.println("usage: java ArrayEx17 NUM1 OF NUM2");
			System.exit(0);		
		}
		
		int num1 = Integer.parseInt(args[0]);	// 문자열을 숫자로 변환한다.
		char op  = args[1].charAt(0);			// 문자열을 문자(char)로 변환한다.
		int num2 = Integer.parseInt(args[2]);
		int result = 0;
		
		switch(op) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case 'x':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			default:
				System.out.println("지원되지 않는 연산입니다.");
		}
		System.out.println("결과:" + result);
	}

}
