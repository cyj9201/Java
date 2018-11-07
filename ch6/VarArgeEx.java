// 가변인자(varargs)와 오버로딩

package ch6;

public class VarArgeEx {

	public static void main(String[] args) {
		
		String[] strArr = { "100", "200", "300"};
		
		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate(",", new String[] {"1","2","3"}));
		System.out.println("[" + concatenate(",", new String[0])+"]");
		System.out.println("[" + concatenate(",") + "]");

	}
	
	static String concatenate(String delim, String... args) {
		
		String result = "";
		
		for(String str : args) {
			result += str + delim;
		}
		
		return result;
	}
/*	
	static String concatenate(String... args) { 	// 두 오버로딩된 매서드가 구분되지 않을 경우 에러 발생
	return concatenate("", args);
	}
*/
}
