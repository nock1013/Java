package chap04;

import java.util.Scanner;
//��øif�� - if�� �ȿ� if�� �����ϰ� ����ϱ�(��� ����� ��ø�� �� �ִ�.)
public class IfTest03 {

	public static void main(String[] args) {
		//Scanner�� ������ �Է� �޾� 90�� �̻��̸� "���" �ƴϸ� "�����"
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("��������: ");
		int score = scanner.nextInt();
		
		System.out.print("����Ƚ��: ");
		int count = scanner.nextInt();
		
		if(score >= 90)
		{
			System.out.println("���");	
		}
		else
		{
			if(count < 3)
			{
				System.out.println("�� ���� �����...");
			}
			else
			{
				System.out.println("ó������ �ٽ� ����...");
			}
		}

	}

}
