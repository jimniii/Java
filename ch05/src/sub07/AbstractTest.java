package sub07;

// 추상클래스 실습



public class AbstractTest {
	public static void main(String[] args) {
		
		// 추상클래스는 단독으로 객체를 생성할 수 없음 ! 
		// Animal animal = new Animal();
		
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
	}
}
