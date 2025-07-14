package sub01;

//* 자바 객체지향 프로그래밍 클래스 실습 


public class ClassTest {
	public static void main(String[] args) {
		
		// 객체 생성(인스턴스화)
		
		Car sonata = new Car();
		
		// 객체 초기화
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		// 객체 상호작용(기능 활용)
		sonata.SpeedUp(80);
		sonata.speedDown(10);
		sonata.show();
		
		// 객체 생성, 초기화, 상호작용
		
		Car avante; // 선언 (null 상태)
		avante = new Car(); // 생성 
		// 분리형은 선언만 먼저 해두고, 나중에 조건에 따라 객체를 생성할 때 사용 
		
		avante.name = "아반테"; // 초기화: 변수에 최초로 값을 대입 
		avante.color = "검정색";
		avante.speed = 0;
		
		
		avante.SpeedUp(60);
		avante.speedDown(20);
		avante.show();
		
		/*
		 * 은행계좌 객체 생성
		 * 은행 : 국민은행(kb)
		 * 계좌번호: 101-11-1001
		 * 입금주: 김유신
		 * 현재잔액: 0
		 */
		
		// 객체 생성
		Account kb = new Account();
		
		// 초기화
		kb.bank = "국민은행";
		kb.id = "101-11-1001";
		kb.name = "김유신";
		kb.balance = 0;
		
		
		// 객체 상호작용
		kb.deposit(100000);
		kb.withdraw(30000);
		kb.show();
		
		/*
		 * 은행계좌 객체 생성 및 초기화
		 * 은행명: 우리은행(wr)
		 * 계좌번호: 101-21-2001
		 * 입금주: 김춘추
		 * 초기잔액: 10000
		 * 출력잔액: 25000
		 * 
		 */
		
		Account wr = new Account();
		wr.bank = "우리은행";
		wr.id = "101-21-2001";
		wr.name ="김춘추";
		wr.balance = 10000;
		
		wr.deposit(15000);
		wr.withdraw(905000);
		wr.show();
		
		
		
		
		
	}
}
