package book.exam.constructor;

public class SamsungTV implements TV{
	Speaker speaker;
	public SamsungTV(Speaker speaker) {
		super();
		this.speaker = speaker;
	}
	public void powerOn() {
		System.out.println("SamsungTV---���� �Ҵ�.");
	}
	public void powerOff() {
		System.out.println("SamsungTV---���� ����.");
	}

	public void soundUp() {
		System.out.println("SamsungTV---�Ҹ� �ø���.");
		speaker.soundUP();
	}

	public void soundDown() {
		System.out.println("SamsungTV---�Ҹ� ������.");
		speaker.soundDown();
	}
}
