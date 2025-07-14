package sub03;

// 클래스 설계(정의)


public class Car {

	
	// 속성(멤버 변수, 필드)
	private String name;
	private String color;
	private int speed;
	
	
	// 전체 차량 수를 저장하는 클래스 변수 
	private static int count; // 클래스변수(정적변수)는 일반적으로 public
	
	// 만약 private한 static 변수일 경우 getter가 필요 
	
	// 생성자(Constructor) - 속성을 초기화하는 반환 타입이 없고 클래스 이름이 그대로 메서드 이름으로 사용
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++; // 차량 증가
	}
	
	// 기능(멤버 메서드)
	public void speedUp(int speed) {
		
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
	
	// Getter/Setter - 은닉된 속성을 안전하게 처리하기 위한 메서드
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	// 클래스 메서드 
	public static int getCount() {
		return count;
	}
	
}
