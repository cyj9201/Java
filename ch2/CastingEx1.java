package ch2;

public class CastingEx1 {

	public static void main(String[] args) {
		double d  = 85.4;
		int score = (int)d;
		
		System.out.println("score = " + score); // boolean을 제외한 나머지 type들은 형변환가능
		System.out.println("d = " + d);
	    
	}

}
