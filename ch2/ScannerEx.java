
package ch2;

import java.util.Scanner; // Scanner�� ����ϱ����� �߰�

public class ScannerEx {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ڸ� ������ �Է��Ͻÿ�>>");
		String input = scanner.nextLine();
		scanner.close();
		
		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ
		System.out.println("�Է³��� : " + input);
		System.out.printf("result = %d%n", num);
		
	}

}
