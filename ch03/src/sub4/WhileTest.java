package sub4;

/*
 * 날짜: 2025/07/08
 * 이름: 이지민
 * 내용: 자바 while 반복문 실습
 */


public class WhileTest {
	public static void main(String[] args) {
		
		// 1부터 10까지 합
		
		int sum=0;
		int i =1;
		
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		// do-while: 최초 무조건 한번 반복 실행
		
		int total = 0;
		int j=1;
		do{
			if(j%2==0) {
				total+=j;
			}
			j++;
			
		}while(j<=10);
		System.out.println("1부터10까지합:"+total);
		
		
		// break
		
		int num=1;
		while(true) {
			if(num%5==0 && num%7 ==0) {
				break; // 반복문 탈출
			}
			
			num++;
		}
		System.out.println("5와7의 최소공배수:"+num);
		
		
		
		
		// continue
		int tol =0;
		int a=1;
		
		while(a<=10) {
			a++;
			
			if(a%2==1) {
				continue;
			}
			
			tol +=a;
		}
		
		System.out.println("1부터 10까지 짝수합:"+tol);
		
		
		
		
		
	}
	
	
	
	
	
}
