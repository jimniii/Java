package sub05;


// 메서드 오버라이딩 실습

class AAA {
	public void method1() {
		System.out.println("AAA:method1...");
	}
	public void method2() {
		System.out.println("AAA:method2...");
	}
	public void method3() {
		System.out.println("AAA:method3...");
	}
	
}


class BBB extends AAA{
	
	@Override
	public void method2() {
		// 부모클래스 method2를 override
		System.out.println("BBB:method2...");
	}
	public void method3(int a) { //Overload 메서드
		System.out.println("BBB:method3...");
	}
	
}

class CCC extends BBB{
	
	@Override
	public void method1() {
		System.out.println("CCC:method1...");
	}
	@Override
	public void method2() {
		System.out.println("CCC:method2...");
	}
	public void method3(int a, int b) { //Overload 메서드
		System.out.println("CCC:method3...");
	}
	
}


public class MethodOverridingTest {
	public static void main(String[] args) {
		
		// 오버라이딩 메서드 실습
		CCC c = new CCC();
		c.method1();
		c.method2();
		c.method3();
		c.method3(1);
		c.method3(1,2);
		
		
		// Sedan 클래스 오버라이딩 메서드 실습
		Sedan sonata = new Sedan("소나타","흰색",0,2000);
		sonata.speedUp(200);
		sonata.show();
		
		
	}
}



