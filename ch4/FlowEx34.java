// FlowEx32 ���� ����

package ch4;

import java.util.*;

public class FlowEx34 {

	public static void main(String[] args) {
		
		int menu = 0;
		int num  = 0;
		
		Scanner sc = new Scanner(System.in);
		
		outer:
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
				System.out.println("�Ŵ��� �߸� �ԏ��ϼ̽��ϴ�.(�����ư:0)\n");
				continue;
			}
		
		for(;;) {
			System.out.print("����� ���� �Է��ϼ���.(��� ����:0, ��ü ����:99)");
			tmp = sc.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num==0)
				break;
			else if(num==99)
				break outer;
			switch(menu) {
				case 1:
					System.out.println("result = "+ num*num + "\n");
					break;
				case 2:
					System.out.println("result = "+ Math.sqrt(num) + "\n");
					break;
				case 3:
					System.out.println("result = "+ Math.log(num) + "\n");
					break;		
				}
			}
		}

	}

}
