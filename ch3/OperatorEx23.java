// str2와 "abc"의 내용은 같지만 서로 다른 객체라 비교시 false값

package ch3;

public class OperatorEx23 {

	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = new String("abc");
	
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n", str1=="abc");
		System.out.printf(" str2==\"abc\" ? %b%n", str2=="abc");
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC")); // equalsIgnoreCase(): 대소문자를 구별하지 않고 비교시
	
	}

}
