// switch ���� ��ø
// ���������� break; �ʿ�
package ch4;

import java.util.*;

public class FlowEx11 {

	public static void main(String[] args) {
		
		System.out.println("����� �ֹι�ȣ�� �Է��Ͻÿ�(ex:011231-1111222)>>");
		
		Scanner sc = new Scanner(System.in);
		String regNo = sc.nextLine();
		char gender = regNo.charAt(7);		// �Է¹��� ��ȣ�� 8��° ���ڸ� gender�� ����
		sc.close();
		
		switch(gender) {
			case '1': case '3':
				switch(gender) {
					case '1':
						System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
						break;
					case '3':
						System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�.");
						break;
				}
			break;
			case '2': case '4':
				switch(gender) {
					case '2':
						System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
						break;
					case '4':
						System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�.");
						break;
				}
			break;	
			default:
				System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
		
	}

}
