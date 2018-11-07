// ����� �ʱ�ȭ�� ���� �迭 arr�� �����ϰ�, Ŭ���� �ʱ�ȭ ���� �̿��ؼ� �迭�� �� ��Ҹ�
// random()�� ����ؼ� ������ ������ ä�쵵�� �ߴ�.

package ch6;

public class StaticBlockTest {

	static int[] arr = new int[10];
	
	static {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
		}
	}
	
	public static void main(String[] args) {
		for(int i=0; i<arr.length;i++)
			System.out.println("arr[" + i +"] :" + arr[i]);
	}

}
