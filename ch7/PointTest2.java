// Point3D Ŭ������ �ν��Ͻ��� ������ �� � ������ �ν��Ͻ��� �ʱ�ȭ�� ����Ǵ� �� �����ֱ� ���� ����
package ch7;

public class PointTest2 {

	public static void main(String[] args) {
		
		Point3E p3 = new Point3E();
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);
		
	}

}

class Point3 {
	
	int x = 10;
	int y = 20;
	
	Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}

class Point3E extends Point3 {
	
	int z = 30;
	
	Point3E() {
		this(100, 200, 300);	// Point3D(int x, int y, int z)�� ȣ���Ѥ�.
	}
	
	Point3E(int x, int y, int z){
		super(x, y); 			// Point(int x, int y)�� ȣ���Ѵ�.
		this.z = z;
	}
	
}





