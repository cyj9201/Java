// Scanner class를 사용하기 위해 java.util 모듈 추가

package ch3;

import java.util.*;

public class OperatorEx25 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
				
		System.out.printf("문자를 하나 입력하세요.>");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		scanner.close();
		
		if('0' <= ch && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		}
		
		if(('a' <= ch && ch <= 'z') || ('A'<=ch && ch <= 'z')){
			System.out.printf("입력하신 문자는 영문자입니다.%n");
		}	
	} // main

}
