package sub08;

public class RemoteLG implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("LG poweron...");
	}

	@Override
	public void powerOff() {
		System.out.println("LG powerdown...");
	}

	@Override
	public void chUp() {
		System.out.println("LG chUp...");
	}

	@Override
	public void chDown() {
		System.out.println("LG chDown...");
	}

	@Override
	public void soundUp() {
		System.out.println("LG soundUp...");
	}

	@Override
	public void soundDown() {
		System.out.println("LG soundDown...");
	}

}
