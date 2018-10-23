// 임의의 값으로 배열 채우기

package ch5;

import java.util.*;

public class ArrayEx9 {

	public static void main(String[] args) {
		
		int[] code = {-4, -1, 3, 6, 11};
		int[] arr  = new int[10];
		
		for (int i=0; i < arr.length; i++) {
			int tmp = (int)(Math.random() * code.length);
			arr[i] = code[tmp];
		}
			
		System.out.println(Arrays.toString(arr));
	}

}
