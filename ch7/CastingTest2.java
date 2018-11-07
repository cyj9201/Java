// 참조변수가 가리키는 인스턴스의 자손타입으로 형변환은 허용x

package ch7;

public class CastingTest2 {

	public static void main(String[] args) {
	
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car;		// 컴파일은 성공하지만 실행시 에러(형변환에 오류)
		fe.drive();
		car2 = fe;
		car2.drive();
		
	}
	
}
