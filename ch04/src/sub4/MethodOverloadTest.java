package sub4;

public class MethodOverloadTest {
	public static void main(String[] args) {
		
		int r1 = add(3);
		int r2 = add(2,3);
		double r3 = add(1.2,3.14);
		String r4 = add("ab","cd");
		String r5 = add("number",1);
		
		System.out.println("r1: "+r1);
		System.out.println("r2: "+r2);
		System.out.println("r3: "+r3);
		System.out.println("r4: "+r4);
		System.out.println("r5: "+r5);
		
	}
	
	// 오버로딩 메서드 정의: 메서드 이름은 같은데 매개변수가 다른거 
	
	public static int add(int a) {
		return a+1;
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static double add(double a, double b) {
		return a+b;
	}
	
	public static String add(String a, String b) {
		return a+b;
	}
	
	public static String add(String a, int b) {
		return a+b;
	}
	
}
