// ����{}

package ch4;

import java.util.*;

public class FlowEx2 {

	public static void main(String[] args) {
		
		int input;
		System.out.print("���ڸ� �ϳ� �Է��ϼ���.>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();		// ȭ���� ��� �Է¹��� ������ tmp�� ����
		input = Integer.parseInt(tmp);			// �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
		scanner.close();
		
		if(input == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		}		
		
		if(input != 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");			// ����{}�� �����߱� ������ 3��° printf���� �׻� ��µȴ�.
			System.out.printf("�Է��Ͻ� ���ڴ� %d�Դϴ�.", input);
		}
	}

}