package Step2;

import java.util.Scanner;

public class Main06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int shour = sc.nextInt();
		int sminute = sc.nextInt();
		int eminute = sc.nextInt();
		
		
	
		int hour = (shour+(sminute+eminute)/60)%24;
		int minute = (sminute+eminute)%60;
		
		System.out.println(hour+" "+minute);
		

	}
}
