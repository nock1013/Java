package chap04;

import java.util.Scanner;

//switch ���� - �⺻����
//switch���� Ư���� Ȱ��
public class SwitchTest02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է��ϼ���.");
		int ssn = scanner.nextInt(); 
		switch (ssn) { 
			case 1: case 3:
				System.out.println("����");
				break;	
			case 2: case 4:
				System.out.println("����");
				break;
			default:	
				System.out.println("��Ÿ");
				break;
		}

	}

}
