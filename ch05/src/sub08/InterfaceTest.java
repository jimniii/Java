package sub08;

// 인터페이스 실습하기 

public class InterfaceTest {

	public static void main(String[] args) {
		
	
		// 인터페이스 역할1: 통일된 표준화 설계
		RemoteControl lg = new RemoteLG();
		lg.powerOn();
		lg.chUp();
		lg.soundDown();
		lg.powerOff();
		
		
		RemoteControl samsung = new RemoteSamsung();
		samsung.powerOn();
		samsung.chUp();
		samsung.soundDown();
		samsung.powerOff();
		
		
		// 인터페이스 역할2: 결합도 완화(유연성)
		
		Bulb bulb = new Bulb();
		Socket socket = new Power(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
		
		// 인터페이스 역할3: 다중 상속 효과 
		
		SmartTv smartTv = new SmartTv();
		smartTv.process();
		
		
		
		
	}
	
}