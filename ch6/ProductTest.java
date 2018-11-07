// 멤버변수의 초기화 시기와 순서
// Product 클래스의 인스턴스가 고유의 일련번호를 갖도록 한 예제
package ch6;

class Product{

	static int count = 0;
	int serialNo;
	
	{
		++count;			// Product 인스턴스가 생성될 때마다 
		serialNo = count; 	// count의 값을 1씩 증가시켜서 serialNo에 저장한다.
	}

}

public class ProductTest {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();

		System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo);
		System.out.println("p2의 제품번호(serial no)는 " + p2.serialNo);
		System.out.println("p3의 제품번호(serial no)는 " + p3.serialNo);
		System.out.println("생산된 제품의 수는 모두 " + Product.count + "개 입니다.");
		
	}

}




