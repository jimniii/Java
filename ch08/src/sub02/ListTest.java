package sub02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import sub01.Apple;

/*
 * 자바 리스트 실습하기
*/

public class ListTest {
	public static void main(String[] args) {
		
		
		
		// ArrayList 기본
		
		// 제네릭'E'는 리스트의 타입을 정해준다 ! 
		// 제네릭은 wrapper 써야함 기본타입 취급 안함
		List<Integer> list = new ArrayList();
		
		
		
		// 데이터 삽입
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1,9); // 배열의 첫번째에 9를 넣겠다 
		System.out.println(list);
		
		// 데이터 제거
		list.remove(2); // 2번째 원소를 제거하라(2를 제거하는거 아님)
		System.out.println(list);
		
		list.remove(3); // 3번쨰 원소를 제거하라
		System.out.println(list);
		
		// 데이터 출력
		
		
		System.out.println("list 1번째 원소: "+list.get(0));
		System.out.println("list 2번째 원소: "+list.get(1)); // 얘도 인덱스임 값 아님 !!
		System.out.println("list 3번째 원소: "+list.get(2));
		
		// 리스트 크기
		System.out.println("list 크기: "+list.size());
		
		// 리스트 반복
		
		for(int num:list) { //Auto unboxing
			System.out.println("num: "+num);
		}
		
		// 문자열 리스트 실습
		
		List<String> people = new ArrayList<String>();
		people.add("김유신");
		people.add("김춘추");
		people.add("장보고");
		people.add("강감찬");
		people.add("이순신");
		
		System.out.println(people);
		
		
		// 마지막에 정약용 추가ㅇ
		// 강감찬-이순신 사이에 이성계 삽입ㅇ
		// 김유신 = 김춘추 사이에 '비담'삽입ㅇ
		// 장보고 제거 후 '왕건'삽입
		// 이성계를 정도전으로 교체
		
		people.add("정약용");
		// System.out.println(people);
		people.add(4,"이성계");
		//System.out.println(people);
		people.add(1,"비담");
		//System.out.println(people);
		people.remove(3);
		//System.out.println(people);
		people.add(3,"왕건");
		//System.out.println(people);
		
		// 이성계를 정도전으로 교체 (5번째) // set() 리스트 원소 교체 
		people.set(5, "정도전");
		System.out.println(people);
		
		
		//////////////////////////
		///// 객체 리스트 
		//////////////////////////
		
		Apple a1 = new Apple("한국",3000);
		Apple a2 = new Apple("일본",2000);
		
		List<Apple> apples = new ArrayList<Apple>();
		
		apples.add(a1);
		apples.add(a2);
		apples.add(new Apple("중국",1000));
		
		Apple koreaApple = apples.get(0);
		System.out.println(koreaApple);
		
		System.out.println(apples);
		
		for(Apple apple : apples) {
			System.out.println(apple);
		}
		
		
		
		/////////////////////////
		/// LinkedList
		/////////////////////////
		
		
		LinkedList<String> cities = new LinkedList<String>();
		cities.add("서울");
		cities.add("대전");
		cities.add("대구");
		cities.add("부산");
		cities.add("광주");
		
		System.out.println(cities);
		
		// 데이터 삽입
		cities.add(1,"수원");
		cities.addFirst("인천");
		cities.addLast("울산");
		
		System.out.println(cities);
		
		
	}
}
