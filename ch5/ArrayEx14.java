// char배열과 String클래스의 변환

package ch5;

public class ArrayEx14 {

	public static void main(String[] args) {

		String src = "ABCDE";
		for(int i=0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt("+i+"):"+ ch);
		}
		
		char[] chArr = src.toCharArray();
		System.out.println(chArr);
		
	}

}
