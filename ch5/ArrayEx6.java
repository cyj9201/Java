// 배열에 저장된 값 중에서 최대값과 최소값을 구하는 예제

package ch5;

public class ArrayEx6 {

	public static void main(String[] args) {
	
		int [] score = {79, 88, 91, 33, 100, 55, 95};
		// 배열의 첫번째 값으로 최대,최소값 초기화
		int max = score[0];
		int min = score[0];
		
		for(int i = 1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			} else if(score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
	}

}

