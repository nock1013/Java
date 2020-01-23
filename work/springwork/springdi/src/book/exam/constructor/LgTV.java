package book.exam.constructor;

public class LgTV implements TV{
	//���� Ŭ���� ���ο��� ����ϴ� ��ü - �����������̳ʸ� ���� ���޹��� �� �ֵ��� �غ�
	Speaker speaker;
	public LgTV(Speaker speaker) {
		super();
		this.speaker = speaker;
	}

	public void powerOn() {
		System.out.println("LgTV---���� �Ҵ�.");
	}

	public void powerOff() {
		System.out.println("LgTV---���� ����.");
	}

	public void soundUp() {
		speaker.soundUP();
		System.out.println("LgTV---�Ҹ� �ø���.");
	}

	public void soundDown() {
		speaker.soundDown();
		System.out.println("LgTV---�Ҹ� ������.");
	}
}
