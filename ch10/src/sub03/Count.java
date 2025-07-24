package sub03;

public class Count {
	
	private int num = 0;
	

	public int getNum() {
		return num;
	}
	
	// synchronized: 동기화 블럭(무조건 스레드 하나만 실행). 스레드의 경합을 막고 순차적으로 스레드 실행 
	public synchronized void setNum() {
		// 임계영역: 하나의 스레드가 해당 영역에 들어올 때 Lock을 걸고 영역을 빠져나갈 때 해제
		
		this.num++;
		
	}
}
