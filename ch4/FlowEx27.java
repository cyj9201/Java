// 숫자를 입력하다가 0을 입력하면 입력을 마치고 총 합을 출력하는 예제

package ch4;

import java.util.*;

public class FlowEx27 {

	public static void main(String[] args) {
		
		int num;
		int sum = 0;
		boolean flag = true;
		
		System.out.print("합계를 구할 숫자를 입력하세요(끝내려면 0을 입력)");
		
		while(flag) {
			System.out.print(">>");
			
			Scanner sc = new Scanner(System.in);
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);
						
			if(num != 0) {
				sum += num;
			}
			else {
				flag = false;
			}
			
		}
		
		System.out.println("합계: " + sum);
	}
	
}
