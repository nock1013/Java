package oop.chap06;
// MyMethodŬ�������� ������ Method�� ����ϴ� Ŭ����
public class MyMethodTest {

	public static void main(String[] args) {
		MyMethod m = new MyMethod();
		
		// 1. �Ű������� ���� void�� �޼����� ȣ��
		System.out.println("=================== step1");
		m.display();
		System.out.println("=================== step2");
		m.display();
		
		// 2. �Ű������� �� ��, ���ϰ��� ���� �޼��� ȣ��
		m.display("��");
		m.display("��");
		m.display("��");
		System.out.println("============================");
		
		// 3. ���ϰ��� ���� �Ű������� �� ���� �޼���
		m.display("��", 10);
		m.display("��", 8);
		m.display("��", 6);
		System.out.println("============================");
		
		// 4. �Ű�����, ���ϰ��� ��� �ִ� �޼���
		// �޼��带 ȣ���ϴ� ��� ���ϰ��� �����ϴ� �޼�����
		// 1. ���ϰ��� ������ Ÿ���� ������ �����ؼ� ������ �־�� �Ѵ�.
		// 2. �ٸ� �޼����� �Ű������� ������ �� �ִ�.
		int result = m.add(200, 300);
		
		System.out.println("ȣ�� ��� => " + result);
		System.out.println("ȣ�� ��� => " + m.add(200, 300));
		System.out.println("============================");
		
	
		
	}

}
