package ch2;

public class CharToCode {

	public static void main(String[] args) {
		
		char ch = 'A';			// char ch = 65('A'�� �����ڵ�);
		int code = (int)ch;		// ch�� ����� ���� int Ÿ������ ��ȯ

		System.out.printf("%c=%d(%#X)%n", ch, code, code); // 16������ 0x41
		
		char hch = '��';		    // char hch = 0xAC00('��'�� �����ڵ�);
		System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
	}

}
