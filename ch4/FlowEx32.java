// continue��
// �Ŵ��� �����ְ� �����ϰ� �ϴ� ����

package ch4;

import java.util.*;

public class FlowEx32 {

	public static void main(String[] args) {
		
		int menu = 0;
		int num  = 0;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("���ϴ� �Ŵ��� �����ϼ���(�����ư:0)>>");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
			
			if(menu==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			else if(!(1<= menu && menu<=3)) {
				System.out.println("���ڸ� �߸� �ԏ��ϼ̽��ϴ�.\n");
				
				continue;
			}
			System.out.println("�����Ͻ� �Ŵ��� "+ menu +"���Դϴ�.\n");
			
		}
				
	}

}
