package Step3;

import java.util.Scanner;

public class Main06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int total = 0;
		int[] result = new int[count];
		
		
		for(int i =0;i<count;i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			total = a+b;
			result[i] = total;
		}
		
		for(int num:result) {
			System.out.println(num);
		}
		
		
	}
}
