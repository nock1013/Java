package chap04;

import java.util.Scanner;

// while ���� do...while���� ������
public class DoWhileTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num = 10;
		while(num < 10)
		{
			//while���� ������ �������� ������ �� ���� �ڵ尡 ������� �ʴ´�.
			System.out.println("while�� - �����ɹ�: " + num);
			num++;
		}
		//num = 10;
		do {
			System.out.print("���� �Է� : ");
			num = key.nextInt();
			System.out.println("do...while�� - �����ɹ�: " + num);
		} while(num > 10);
	}

}
