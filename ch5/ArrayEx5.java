// for문을 이용해서 배열에 저장된 값을 모두 더한 결과를 배열의 개수로 나누어서 평균을 구하는 예제

package ch5;

public class ArrayEx5 {

	public static void main(String[] args) {
		
		int   sum     = 0;
		float average = 0f;
		
		int[] score = {100, 88, 100, 100, 90};
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		average = sum / (float)score.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
		
	}

}
