// ����ڷκ��� ���ڸ� �Է¹ް�, �� ������ �� �ڸ����� ���ϴ� ����

package ch4;

import java.util.*;

public class FlowEx25 {

	public static void main(String[] args) {
		
		int num = 0, sum = 0 ;
		System.out.print("���ڸ� �Է��Ͻÿ�(����:14314)>>");

		Scanner sc = new Scanner(System.in);
		int tmp = sc.nextInt();			// String tmp = sc.nextLine();
		num = tmp;						// num = Integer.parseInt(); 
		sc.close();
		
		while(num!=0) {
			sum += num%10;		// sum = sum + num%10
			System.out.printf("sum=%3d num=%d%n", sum, num);
			num /= 10;			// num = num / 10
			
		}
		
		System.out.println("�� �ڸ����� ��:" + sum);
	}

}
