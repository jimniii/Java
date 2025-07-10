package Step3;

import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();

		int[] arr = new int[t];
		
		for(int i=0 ; i<t; i++) {
			int a = sc.nextInt(), b = sc.nextInt();	
			arr[i] = a+b;
		} 	
		
		for(int n:arr) {
			System.out.println(n);
			
		}
	
	}
}
