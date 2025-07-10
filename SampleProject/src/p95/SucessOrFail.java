package p95;

import java.util.Scanner;

public class SucessOrFail {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요:");
		int score = scanner.nextInt();
		if(score>=80)
			System.out.println("축하 합격");
		
		scanner.close();
	
	}
}
