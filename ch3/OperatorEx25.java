// Scanner class�� ����ϱ� ���� java.util ��� �߰�

package ch3;

import java.util.*;

public class OperatorEx25 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
				
		System.out.printf("���ڸ� �ϳ� �Է��ϼ���.>");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		scanner.close();
		
		if('0' <= ch && ch <= '9') {
			System.out.printf("�Է��Ͻ� ���ڴ� �����Դϴ�.%n");
		}
		
		if(('a' <= ch && ch <= 'z') || ('A'<=ch && ch <= 'z')){
			System.out.printf("�Է��Ͻ� ���ڴ� �������Դϴ�.%n");
		}	
	} // main

}
