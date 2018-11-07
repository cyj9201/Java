// �Ű������� ������
// ���� buy�ż��带 �̿��ؼ� Tv�� Computer�� �����ϰ�, ���� �ܰ�� ���ʽ� ������ ����ϴ� �����̴�.
package ch7;

class Product{
	
	int price;
	int bounsPoint;
	
	Product(int price){
		this.price = price;
		bounsPoint = (int)(price/10.0);		// ���ʽ������� ��ǰ������ 10%
	}
	
}

class Tv3 extends Product{

	Tv3(){
		// ����Ŭ������ ������ Product�� ȣ���Ѵ�.
		super(100);		// Tv�� ������ 100�������� �Ѵ�.
	}
	// ObjectŬ������ toString()�� �������̵��Ѵ�.
	public String toString() { return "TV"; }
	
}

class Computer extends Product {

	Computer() { super(200); }
	public String toString() { return "Computer"; }
	
}

class Buyer{		// ��, ������ ��� ���

	int money = 1000;		// �����ݾ�
	int bounsPoint = 0;		// ���ʽ�����
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -= p.price;			// ���� ������ ������ ��ǰ�� ������ ����.
		bounsPoint += p.bounsPoint; // ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
	
}

public class PolyArgumentTest {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
		b.buy(new Tv3());
		b.buy(new Computer());
		
		System.out.println("���� ���� ���� " + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ������� "+ b.bounsPoint + "���Դϴ�.");

	}

}
