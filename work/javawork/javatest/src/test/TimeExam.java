package test;
public class TimeExam
{
	public static void main(String[] args)
	{
		//time������ ����� ���� �� �������̴�.
		//__�ð� __�� __���� ���·� ����ϱ�
		int time = 8888;

		int hour = time / 3600;
		int minute = (time % 3600) / 60;
		int second = (time % 3600) % 60;

		System.out.println(hour +"�ð� " + minute + "�� " + second + "��");

	}
}
