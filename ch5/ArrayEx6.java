// �迭�� ����� �� �߿��� �ִ밪�� �ּҰ��� ���ϴ� ����

package ch5;

public class ArrayEx6 {

	public static void main(String[] args) {
	
		int [] score = {79, 88, 91, 33, 100, 55, 95};
		// �迭�� ù��° ������ �ִ�,�ּҰ� �ʱ�ȭ
		int max = score[0];
		int min = score[0];
		
		for(int i = 1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			} else if(score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("�ִ밪 :" + max);
		System.out.println("�ּҰ� :" + min);
	}

}

