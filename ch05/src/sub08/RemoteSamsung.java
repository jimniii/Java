package sub08;

public class RemoteSamsung implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("Samsung poweron...");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung powerdown...");
	}

	@Override
	public void chUp() {
		System.out.println("Samsung chUp...");
	}

	@Override
	public void chDown() {
		System.out.println("Samsung chDown...");
	}

	@Override
	public void soundUp() {
		System.out.println("Samsung soundUp...");
	}

	@Override
	public void soundDown() {
		System.out.println("Samsung soundDown...");
	}

}
