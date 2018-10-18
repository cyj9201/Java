// 반복회수가 많은 경우

package ch4;

public class FlowEx14 {

	public static void main(String[] args) {
		
		for(int i=1, j=10;i<=10;i++,j--)
			System.out.printf("%d \t %d%n", i, j);
		
		System.out.println("");
		
		for(int i=1; i<=10; i++)
			System.out.printf("%d \t %d%n", i, 11-i);
		
	}

}
