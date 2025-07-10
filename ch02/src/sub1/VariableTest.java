package sub1;

/*
 * 날짜: 2025/07/07
 * 이름: 이지민
 * 내용: 변수 실습
 * 
 */


public class VariableTest {

	public static void main(String[] args) {
		
		// 변수(Variable)
		int a = 3; // 선언 후 초기화 
		int b = 7;
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		
		// 재할당
		a = 5;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		// 상수(Constant) - 상수는 대문자 관습 
		final int NUM = 10;
		
		// 상수는 초기화된 값으로 고정되기 때문에 재할당 안됨
		// num = 11;

		
		
		
	}
}
