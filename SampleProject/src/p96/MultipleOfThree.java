package p96;

import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수를 입력해라:");
		int number = scanner.nextInt();
		if(number %3 ==0)
			System.out.println("3의 배수임");
	}
}
