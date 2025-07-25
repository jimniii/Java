package sub02;

import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * 자바 컬렉션 스트림 실습
 */

class Person{
	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}


public class CollectionStrimTest {
	public static void main(String[] args) {
		
		List<String> person = new ArrayList<>();
		
		person.add("김유신");
		person.add("김춘추");
		person.add("장보고");
		person.add("강감찬");
		person.add("이순신");
		
		
		// 외부 반복자를 이용한 출력 
		Iterator<String> it = person.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		
		for(String persons: person) {
			System.out.println(persons);
		}
		
		// 내부 반복자를 이용한 출력 
		System.out.println();
		Stream<String> stream = person.stream();
		stream.forEach((persons) -> {
			System.out.println(persons);
		});
		
		
		List<Person> people = new ArrayList<>();
		people.add(new Person("김유신",23));
		people.add(new Person("김춘추",21));
		people.add(new Person("강감찬",33));
		people.add(new Person("장보고",43));
		people.add(new Person("이순신",53));
		
		
		people.stream().forEach((p)->{
			System.out.println(p);
		});
		
		System.out.println();
		
		people.stream().forEach(System.out::println);
		
		
	}
}
