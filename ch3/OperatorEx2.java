package ch3;

public class OperatorEx2 {

	public static void main(String[] args) {
		
		int i=5, j=0;
		
		j = i++;
		System.out.println("j=i++; 실행 후, i=" + i + ", j="+ j);

		i = 5;		// 결과 확인하기 위해 값 변경
		j = 0;
		
		j = ++i;
		System.out.println("j=i++; 실행 후, i=" + i + ", j="+ j);
		
	}

}
