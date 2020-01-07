package oop.chap07;
// static �޼���
// - static ����� �����ϱ� ���� �뵵
// - ��ƿ��Ƽó�� ���� ����ϴ� �޼���
public class StaticMethodDemo {
		public static void staticTest1() {
			//1. static�޼��忡�� static�޼��� �����ϱ� - �Ϲ����� ��� ����
			staticTest2();
			System.out.println("staticTest1()");
		}
		public void display() {
			//2. non-static�޼��忡�� non-static�޼��带 ȣ�� - �Ϲ����� ��� ����
			show();
			System.out.println("display()");
		}
		public void show() {
			//3. non-static�޼��忡�� static�޼��� ȣ�� - �Ϲ����� ��� ����
			// �Ϲ� �޼��带 ����ϴ� �������� �̹� static�޼��尡 �޸𸮿� �ö� �����̱� ������ �����ϴ�.
			staticTest2();
			System.out.println("show()");
		}
		public static void staticTest2() {
			//4. static�޼��忡�� non-static�޼��带 ȣ��
			// -> non-static�޼��尡 �޸𸮿� ���� ������ ���� Ŭ�������� ���ǵ�
			//	   �޼����� �ϴ��� ������ ��ü���� �Ŀ� ȣ���ؾ� �Ѵ�.
			StaticMethodDemo obj = new StaticMethodDemo();
			obj.show();
			System.out.println("staticTest2()");
		}
		public static void staticTest3() {
			
		}
}