package sub04;

public class Person {
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void work() {
		System.out.println("Person is working");
	}
	
	public void introduce(String name, int age) {
		System.out.println("제 이름은"+name+" 이고 나이는" + age +"세 입니다.");
	}
	
	
	
	
}
