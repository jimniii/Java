package sub3;

/*
 * 날짜: 2025/07/08
 * 이름: 이지민
 * 내용: 자바 for 반복문 실습
 */

public class ForTest {
	public static void main(String[] args) {
		
		
		// for 기본
		for(int i=0 ; i<10; i++) {
			System.out.println("i:"+i);
		}
		
		// 1부터 10까지 합
		int sum = 0;
		for(int i=0; i<=10; i++) {
			sum +=i;
		}
		System.out.println("sum:"+sum);
		
		
		// 1부터 10까지 짝수 합
		int total=0;
		
		for(int i=0; i<=10; i++){
			if(i%2==0) {
				total+=i;
			} else
				continue;
		}
		System.out.println("짝수합:"+total);

	
		// for 중첩
		
		for(int a=1; a<=3; a++){
			System.out.println("a:"+a);
			for(int b=1; b<=5; b++){
				System.out.println("b:"+b);
				
			}
			
		}
		
		
		
		// 구구단
		
		for(int i =1; i<9;i++) {
			System.out.println(i+"단");
			for(int n=1; n<10; n++) {
//				System.out.println(i+"*"+n+"="+(i*n));
				System.out.printf("%d * %d = %d\n",i,n,i*n);
			}
		}
		
		
		// 별삼각형
		
		for(int start=1; start<=10; start++) {
			for(int end=1; end <= start; end++)
				System.out.print("☆");
			System.out.print("\n");
		}

		System.out.print("\n");
		
		for(int i=10; i>=1; i--) {
			for(int end=1; end<=i; end++) {
				System.out.print("★");
			}
			System.out.print("\n");
		}
	
		
		
		
		for(int i=5; i>0; i--) {
			System.out.println("*".repeat(i));
		}
		
		
		for(int i=0; i<=10; i++) {
			System.out.println("*".repeat(i));
		}
		

		
		
	}
	
	
}
