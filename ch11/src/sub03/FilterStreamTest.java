package sub03;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * 자바 필터 스트림 실습하기
 */

public class FilterStreamTest {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3);
		
		System.out.println(numbers);
		
		
		// 중복제거
		
		List<Integer> newNumbers = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(newNumbers);
		
		// 3이상 필터링
		List<Integer> number3 = numbers
				.stream()
				.distinct()
				.filter(num->{
			if(num >3) {
				return false;
			} else {
				return true;
			}
		})
				.collect(Collectors.toList());
		System.out.println(number3);
		
		
		
		
		// 중복제거, 짝수 필터링, 내림차순 정렬
		List<Integer> numbers4 = numbers.stream()
				.distinct()
				.filter(num -> num%2 != 0)
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println(numbers4);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
