package sub2;

import java.util.Scanner;

/*
 * 날짜: 2025/07/08
 * 이름: 이지민
 * 내용: 자바 Switch 조건문 실습하기
 * 
 */
public class SwitchTest {
	public static void main(String[] args) {
		
		System.out.print("숫자 입력:");
		
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(); // 숫자입력
		
		System.out.println("입력한 숫자: " + number);
		
	
		
		switch(number%2) {
		
		case 0:
			System.out.println("number은 짝수");
			break;
			
		case 1:
			System.out.println("number은 홀수");
			break;
			
		}
		
		
	}
}
