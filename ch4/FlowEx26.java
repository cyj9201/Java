// 1���� �������� ���Ҷ� �����հ谡 100�� ���� �ʴ� ���� ū �� 

package ch4;

public class FlowEx26 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i   = 0;
		
		// i�� 1�� �������Ѽ� sum�� ��� ���س�����.
		while((sum += ++i) <100) {
			System.out.printf("i = %d �϶� sum = %d%n", i, sum);
		}
		
	}

}
