package chap04;
// if���� ��ø�ؼ� ����ϴ� ���� - gender�� age�� �Ǵ��ؼ� ����� ����ϴ� ����
import java.util.Scanner;
// ctrl + shift + f => �ڵ� ����
public class IfExam02 {
	public static void main(String[] args) {
		// ������ ���̸� �Է¹޾Ƽ� ������ ���� ����ϱ�
		// �Է°�: 1, 3�� ���� 2, 4�� ����
		// ���� 1 ~ 19: û�ҳ�, �� �� ����

		Scanner scanner = new Scanner(System.in);

		int gender = scanner.nextInt();
		int age = scanner.nextInt();

		System.out.print("���� " + gender + "��(��) ����" + age + "��(��) �Է��� ���: ");

		if (gender < 5 & gender > 0) {
			if (gender % 2 == 0) {
				if (age < 20) {
					System.out.println("û�ҳ⿩��");
				} else {
					System.out.println("���ο���");
				}
			} else {
				if (age < 20) {
					System.out.println("û�ҳⳲ��");
				} else {
					System.out.println("���γ���");
				}
			}
		} else {
			System.out.println("���ڸ� �߸� �Է�");
		}

	}

}
