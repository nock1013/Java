package chap04;

import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
		// ���ڸ� �Է¹޾� �������� ������� ����
		// ��, ����� ��� ¦������ Ȧ������ ���
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		char c = 'A';
		System.out.println((int)c);
		if(num < 0)
		{
			System.out.println(num + "��(��) �����Դϴ�.");
		}
		else
		{
			if(num % 2 == 0)
			{
				System.out.println(num + "��(��) ¦���Դϴ�.");
			}
			else
			{
				System.out.println(num + "��(��) Ȧ���Դϴ�.");
			}
		}
	}

}
