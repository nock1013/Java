package chap04;

import java.util.Random;
// if~else���� RandomŬ����
public class IfTest01 {

	public static void main(String[] args) {
		// Random�� nextInt�� �̿��ؼ� 1���� 100������ ���� �߻���Ų �� �۾�
		Random rand = new Random();
		int num = rand.nextInt(100) + 1;
		if(num >= 90)
		{
			System.out.println("����");
			System.out.println("�� ��° ����");
		}
		System.out.println("����");

	}

}