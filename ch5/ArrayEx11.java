// 길이가 10인 배열을 만들고 0과 9사이의 임의의 값으로 초기화

package ch5;

public class ArrayEx11 {

	public static void main(String[] args) {
		
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for (int i=0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 10);
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for (int i=0; i < numArr.length; i++) {
			counter[numArr[i]]++;
		}
		
		for (int i=0; i < numArr.length; i++) {
			System.out.println(i + "의 개수 :" + counter[i]);
		}
				
	}

}
