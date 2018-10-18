// continue문(특정 조건을 만족하는 경우를 제외하고자 할 때)

package ch4;

public class FlowEx31 {

	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++) {
			if(i%3==0)
				continue;
			System.out.println(i);
		}
				
	}

}
