package oop.chap06;

import java.util.Scanner;

public class PersonTest_Insa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*********** �λ���� �ý��� ***********");
		System.out.println("1. �λ���");
		System.out.println("2. ��������");
		System.out.println("3. ����������ȸ");
		System.out.println("4. ��������ȸ");
		System.out.print("���ϴ� ������ �����ϼ���: ");
		int work = scanner.nextInt();
		switch (work) {
			case 1:
				System.out.println("==== �λ��� ====");
				System.out.print("���� : ");
				String name = scanner.next();
				System.out.print("�ּ� : ");
				String addr = scanner.next();
				System.out.print("���� : ");
				int age = scanner.nextInt();
				Person p = new Person(name, addr, age);
				/*p.name = name;	// Person ��ü�� name ���� = ����ڰ� �Է��� name ��
				p.address = addr;
				p.age = age;
				
				System.out.println(p.name + " , " + p.address + " , " + p.age);*/

				break;
			case 2:
				System.out.println("======== ���������ϱ� =========");
			}

	}

}