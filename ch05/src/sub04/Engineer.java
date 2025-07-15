package sub04;

public class Engineer extends Person {

	protected String field;
	
	public Engineer(String name, int age, String field) {
		super(name, age);
		this.field = field;

	}
	
	public void work(String name, int age, String field) {
		super.introduce(this.name,this.age);
		System.out.println("저는"+field+" 엔지니어 입니다.");
	}



}
