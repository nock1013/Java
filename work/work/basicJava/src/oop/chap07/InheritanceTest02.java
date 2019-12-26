package oop.chap07;
/*
 * <��Ӱ��迡�� �޼��尡 ���� Ư¡
 * 1. ��Ӱ��迡���� ����Ŭ������ ���ǵ� �޼��带 ����Ŭ�������� ����� �� �ִ�.
 *    (����Ŭ������ ���������� ���ؼ� ������ �� �ִ�.)
 * 2. ����Ŭ������ ���ǵ� �޼���� ������ �޼��带 ����Ŭ�������� �����ϰ� ����� �� �ִ�.
 *    �̷� ��� ����Ŭ������ �޼��尡 ȣ��ȴ�.
 *    => ����Ŭ������ ����� �޼���� ������ �޼��带 ����Ŭ������ �����ϴ� ����
 *       �޼��� ������(�޼��� �������̵�)��� �Ѵ�.
 *       		  ---------------
 *       			�޼����, �Ű����� ����, �Ű����� Ÿ��, ����Ÿ�� ��� �����ؾ� ��.
*/
class Parent {
	public void display() {
		System.out.println("�θ��� display...");
	}
}
class Child extends Parent {
	public void display() {
		System.out.println("�ڽ��� display...");
		super.display();
	}
	public void test() {
		System.out.println("�ڽ�Ŭ������ test...");
		display();
	}
}

public class InheritanceTest02 {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.test();
		obj.display();
	}

}
