package oop.chap06;
// �޼��� �����ϴ� ������ ���� Ŭ����
public class MyMethod {
	// 1. �Ű������� ���� ���ϰ��� ���� �޼���
	public void display() {
		for(int i = 0; i < 10; i++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	// 2. �Ű������� �� ��, ���ϰ��� ���� �޼��� ȣ��
	public void display(String str) {
		for(int i = 0; i < 10; i++)
		{
			System.out.print(str);
		}
		System.out.println();
	}
	// 3. ���ϰ��� ���� �Ű������� �� ���� �޼���
	public void display(String str, int count) {
		for(int i = 0; i < count; i++)
		{
			System.out.print(str);
		}
		System.out.println();
	}
	
	// 4. �Ű������� ���ϰ��� �ִ� �޼����� ȣ��
	public int add(int num1, int num2) {
		return num1 + num2;
	}
}
