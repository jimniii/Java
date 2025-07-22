package sub01;

// FruitBox를 범용적으로 쓰기 위해 제네릭을 사용한다 !  

public class FruitBox<T> { // 제네릭 클래스 FruitBox의 치환변수 T를 선언
	
	
	private T fruit;
	
	
	public T getFruit() {
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
	
}
