// �ﰢ�� ����� �� ���

package ch4;

import java.util.*;

public class FlowEx17 {

	public static void main(String[] args) {
		
		int num = 0;
		
		System.out.print("*�� ����� ������ ���� �Է��ϼ���>>");
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		num = Integer.parseInt(tmp);
		sc.close();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}