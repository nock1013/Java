package test;
public class SecondExam 
{
	public static void main(String[] args) 
	{
		int num1, num2, result;
		num1 = 200;
		num2 = 100;

		result = num1 + num2;

		System.out.println("[���]");
		System.out.println("num1 => " + num1);
		System.out.println("num2 => " + num2);
		System.out.println("+������ => " + result);

		// �� �� �ּ��� (����) - ������� �ʴ� ��ɹ�
		// result�� �����̹Ƿ� ���� ������ �� �ִ�.
		result = num1 - num2;
		System.out.println("-������ => " + result);

		result = num1 * num2;
		System.out.println("*������ => " + result);

		num2 = 30;
		result = num1 / num2;
		System.out.println("/������ => " + result);

		result = num1 % num2;
		System.out.println("%������ => " + result);
	}
}
