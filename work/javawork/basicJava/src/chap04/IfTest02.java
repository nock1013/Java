package chap04;

import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		//Scanner�� ������ �Է� �޾� 90�� �̻��̸� "���" �ƴϸ� "�����"
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		if(score >= 90)
		{
			System.out.println("���");	
		}
		else
		{
			System.out.println("�����");
		}

	}

}
