package ch2;

public class CharToCode {

	public static void main(String[] args) {
		
		char ch = 'A';			// char ch = 65('A'의 유니코드);
		int code = (int)ch;		// ch에 저장된 값을 int 타입으로 변환

		System.out.printf("%c=%d(%#X)%n", ch, code, code); // 16진수로 0x41
		
		char hch = '가';		    // char hch = 0xAC00('가'의 유니코드);
		System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
	}

}
