// ���� ������ ��ü(object)��  �迭�� �ٷ��
// Product�迭�� ������ ��ǰ���� ������ �� �ֵ��� ������, �迭�� ũ�⸦ 10���� ����(������ ũ�� �� ���� ����.)
package ch7;

class Product2 {
	
	int price;			// ��ǰ�� ����
	int bonusPoint;		// ��ǰ���Ž� �����ϴ� ���ʽ� ����
	
	Product2(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	Product2() {}		// �⺻ ������
}

class Tv4 extends Product2 {
	
	Tv4() { super(100); }	// ����Ŭ���� ������ Product�� ȣ���Ѵ�.
	public String toString() { return "TV"; }
	
}

class Computer2 extends Product2 {
	
	Computer2() { super(200); }	// ����Ŭ���� ������ Product�� ȣ���Ѵ�.
	public String toString() { return "Computer"; }
	
}

class Audio extends Product2 {
	
	Audio() { super(50); }	// ����Ŭ���� ������ Product�� ȣ���Ѵ�.
	public String toString() { return "TV"; }
	
}

class Buyer2 {
	
	int money = 1000;		// �����ݾ�
	int bonusPoint = 0;		// ���ʽ� ����
	Product2[] item = new Product2[10];  // ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0;
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
		}
		money -= p.price;			// ���� ������ ������ ��ǰ�� ������ �A��.
		bonusPoint += p.bonusPoint; // ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		item[i++] = p;				// ��ǰ�� Product[] item�� �����Ѵ�.
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
	
	void summary() {				// ������ ��ǰ�� ���� ������ ����ؼ� ���� �ش�.
		int sum = 0;				// ������ ��ǰ�� �����հ�
		String itemList = "";		// ������ ��ǰ���
	
	// �ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for(int i=0;i<item.length;i++) {
			if(item[i]==null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}

}

public class PolyArgumentTest2 {

	public static void main(String[] args) {
		
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv4());
		b.buy(new Computer2());
		b.buy(new Audio());
		b.summary();
		
	}

}
