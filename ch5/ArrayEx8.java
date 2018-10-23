// 로또 번호를 생성하는 예제

package ch5;

public class ArrayEx8 {

	public static void main(String[] args) {
		
		int[] ball = new int[45];
		
		for(int i=0; i< ball.length; i++)
			ball[i] = i + 1;
		
		int temp = 0;	// 두 값을 바꾸는데 사용할 임시변수
		int j   = 0;
		
		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
		// 0번째부터 5번째 요소까지 모두 6개만 바꾼다.
		for(int i=0; i < 6; i++) {
			j = (int)(Math.random()* 45);
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		
		// 배열 ball의 앞에서부터 6개의 요소를 출력한다.
		for(int i=0; i<6; i++)
			System.out.printf("ball[%d]=%d%n", i , ball[i]);
	}

}
