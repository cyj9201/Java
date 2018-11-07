// Point3D 클래스의 인스턴스를 생성할 때 어떤 순서로 인스턴스의 초기화가 진행되는 지 보여주기 위한 예제
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
		this(100, 200, 300);	// Point3D(int x, int y, int z)를 호출한ㄷ.
	}
	
	Point3E(int x, int y, int z){
		super(x, y); 			// Point(int x, int y)를 호출한다.
		this.z = z;
	}
	
}






