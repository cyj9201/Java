// continue문
// 매뉴를 보여주고 선택하게 하는 예제

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
			System.out.print("원하는 매뉴를 선택하세요(종료버튼:0)>>");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(!(1<= menu && menu<=3)) {
				System.out.println("문자를 잘못 입룍하셨습니다.\n");
				
				continue;
			}
			System.out.println("선택하신 매뉴는 "+ menu +"번입니다.\n");
			
		}
				
	}

}
