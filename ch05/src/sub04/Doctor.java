package sub04;

public class Doctor extends Person {
	
	protected String specialty;
	
	public Doctor(String name, int age, String specialty) {
		super(name, age);
		this.specialty = specialty;
	}
	
	
	public void work(String name, int age, String specialty) {
		super.introduce(this.name,this.age);
		System.out.println("저는 의사이며, 전공은 "+specialty+" 입니다.");
	}


	
	
	
}
