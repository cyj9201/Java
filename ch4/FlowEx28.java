// do - while��(1~100 up & down)
// ���ǽİ� ���� ������ �ٲ���� ���̴�.
package ch4;

import java.util.*;

public class FlowEx28 {

	public static void main(String[] args) {
		
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()* 100) +1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("1�� 100������ ������ �Է��ϼ���>>");
			input = sc.nextInt();
		
			if(input > answer) {
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");
			}
			else if(input < answer) {
				System.out.println("�� ū���� �ٽ� �õ��غ�����.");
			}
		} while(input!=answer);
		sc.close();
		System.out.println("�����Դϴ�");
	}

}
