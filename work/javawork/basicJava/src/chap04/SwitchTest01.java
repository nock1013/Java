package chap04;

import java.util.Scanner;

//switch ���� - �⺻����
//switch�� if~else if���� ����� �� �ִ� ���
public class SwitchTest01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է��ϼ���.");
		int ssn = scanner.nextInt(); // 7��° ���� �Է� 1, 2, 3, 4
		switch (ssn) { // true | false�� �Ǵ��� �� �ִ� ������ �ƴ϶� ���� ���� ����� ����, �����, �޼ҵ� ȣ��
			case 1:
				System.out.println("����");
				break;	// switch���� ����������.
			case 2:
				System.out.println("����");
				break;
			case 3:
				System.out.println("����");
				break;
			case 4:
				System.out.println("����");
				break;
			default:	// else�� ���� ����
				System.out.println("��Ÿ");
				break;
		}

	}

}
