package sub02;


/*
 * 자바 스레드 상태 실습하기
 */


class SubThread extends Thread{
	
	
	
	public void run() {
		
		
		int i = 1;
		
		
		try {
			while(true) {
				System.out.println("i: "+i);
				i++;
				Thread.sleep(1000); // 스레드 1초 일시 정지 

			}
			// interrupted는 일시정지에서 실행대기로 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		


	};
	
}



public class ThreadInterruptTest {
	public static void main(String[] args) {
	
		SubThread sub = new SubThread();
		
		// 작업 스레드 실행
		sub.start();
		
		try {
			// 메인 스레드 5초 일시정지
			Thread.sleep(1000*5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 작업 스레드 일시정지 발생시키기 
		sub.interrupt();
		
		System.out.println("프로그램 종료");
		
		
	
}
	
	
}
