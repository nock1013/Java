package api.util;

import java.util.Scanner;

// Scanner Ŭ����(API)�� ����
// => ���α׷� ���� �߰��� ���� �Է¹��� �� �ִ� ��ɵ��� �����Ѵ�.
public class ScannerTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���: ");
		String data = key.next();	// Space�� Enter�� ������ ������ ���
		System.out.println("Ű����� �Է¹��� ���ڿ�: " + data);
		System.out.print("���ڸ� �Է��ϼ���: ");
		int intVal = key.nextInt();
		System.out.println("�Է¹��� ����: " + intVal);
	}

}
