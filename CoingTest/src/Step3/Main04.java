package Step3;

import java.util.Scanner;

public class Main04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = sc.nextInt();
		int total = sc.nextInt();
		int result = 0;

		for(int i=0; i<total;i++) {
			int a = sc.nextInt(), b=sc.nextInt();
			result += a*b;
		}
		
		if(result == sum) {
			System.out.println("Yes");
		} else
			System.out.println("No");
	}
	
}

