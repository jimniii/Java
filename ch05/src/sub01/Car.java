package sub01;

// 클래스 설계(정의)


public class Car {

	
	
	// 속성(멤버 변수, 필드) - 무조건 private로 선언
	public String name;
	public String color;
	public int speed;
	
	
	
	// 기능(멤버 메서드) - 무조건 public 선언
	public void SpeedUp(int speed) {
		
		// this는 자기참조 키워드, 클래스의 멤버변수 참조
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
		
	}
	
	public void show() {
		System.out.println("차량명 :" + name);
		System.out.println("차량색 :" + color);
		System.out.println("현재속도 :" + speed);
		
	}
	
	
}
