// 사용자로부터 숫자를 입력받고, 이 숫자의 각 자리합을 구하는 예제

package ch4;

import java.util.*;

public class FlowEx25 {

	public static void main(String[] args) {
		
		int num = 0, sum = 0 ;
		System.out.print("숫자를 입력하시오(예시:14314)>>");

		Scanner sc = new Scanner(System.in);
		int tmp = sc.nextInt();			// String tmp = sc.nextLine();
		num = tmp;						// num = Integer.parseInt(); 
		sc.close();
		
		while(num!=0) {
			sum += num%10;		// sum = sum + num%10
			System.out.printf("sum=%3d num=%d%n", sum, num);
			num /= 10;			// num = num / 10
			
		}
		
		System.out.println("각 자리수의 합:" + sum);
	}

}
