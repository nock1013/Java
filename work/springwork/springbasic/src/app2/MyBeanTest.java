package app2;
/*
 * oop�� ����Ǿ� �ִ� ���α׷�
 * oopƯ���� �����ϱ� ���� ����Ŭ������ �����ϰ� MyBeanStyleXXX Ŭ������ ����ϴ�
 * �Ű������� Ÿ���� ����Ÿ������ �����ϸ� �������� �����ߴ�.
 * ���Ǵ� ��ü�� ����Ǵ��� �ڵ带 �����ϴ� ������ �پ���.
 * 
 * �׷��� ��ü ��ü�� �����ϴ� �������� �����ؼ� �����ϰ� �ִ�.
 * ����ϴ� ��ü�� �ٲ������� ��ü�� ���������ϴ� �ڵ� ��� �����ؾ� �Ѵٴ� ������ ������
 * ����ϴ� ������ ���� new�ؼ� ��ü�� �����ϴ� �ڵ�� �������� �ϴ� �ڵ� 
 * */

public class MyBeanTest {

	public static void main(String[] args) {
		MyBeanStyleA obj = new MyBeanStyleA();
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("******************************");
		obj.Hello("����");
		obj.Hello("����");
		System.out.println("******************************");
	}
	public static void show(MyBeanStyle obj) {
		System.out.println("===============================");
		obj.Hello("����");
		obj.Hello("����");
		System.out.println("===============================");
	}
}
