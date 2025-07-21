package sub03;


// 예외 발생 시키기 


// 사용자 정의 클래스
class MinusException extends Exception{
	public MinusException(String message) {
		super(message);
	}
}

class OverException extends Exception{
	public OverException(String message) {
		super(message);
	}
}

class Score{
	
	public void check(int score) throws MinusException, OverException {
		
		if(score < 0) {
			// 예외 발생 시키기
			throw new MinusException("점수는 음수가 될 수 없습니다.");
			
		} else if(score > 100) {
			// 예외 발생 시키기
			throw new OverException("100점을 초과할 수 없습니다.");
			
		} else {
			System.out.println("점수가 이상 없습니다.");
		}
	}
	
}


public class ThrowTest {
	public static void main(String[] args) {
		
		Score score = new Score();
		
		try {
			score.check(-3);
			score.check(129);
			score.check(96);
		} catch (MinusException e) {
			e.printStackTrace();
		} catch (OverException e) {
			e.printStackTrace();
		}
		
		
		
	}
}

