package chap05;
// 2���� �迭 �ۼ� ����
public class Array2DTest {

	public static void main(String[] args) {
		// 2���� �迭�� ����� ����
		int[][] myArr = new int[2][3];
		
		// 2���� �迭�� �ʱ�ȭ
		myArr[0][0] = 100;
		myArr[1][1] = 200;
		
		System.out.println("myArr�� 2��° ��Ұ� �����ϴ� �迭�� 0�� ����� �� : " + myArr[1][0]);
		System.out.println("myArr�� 1��° ��Ұ� �����ϴ� �迭�� 0�� ����� �� : " + myArr[0][0]);
		
		// ������ �迭�� ����� ����
		System.out.println("�迭 ����� ���� => " + myArr.length);
		System.out.println("myArr�� 0�� ��Ұ� �����ϴ� �迭 ����� ���� => " + myArr[0].length);
		System.out.println("myArr�� 1�� ��Ұ� �����ϴ� �迭 ����� ���� => " + myArr[1].length);
		
		// ��ü �迭�� ��Ҹ� �������ϱ� - length�� ���� ���� �����ϱ�
		for(int outer = 0 ; outer < 2; outer++)
		{
			for(int i = 0; i < 3; i++)
			{
				System.out.print(myArr[outer][i] + "\t");
			}
			System.out.println();
		}
		
		// ��ü �迭�� ��Ҹ� �������ϱ� - �迭�� length������ �̿��ؼ� �����ϱ�
		for(int outer = 0 ; outer < myArr.length; outer++)
		{
			for(int i = 0; i < myArr[outer].length; i++)
			{
				System.out.print(myArr[outer][i] + "\t");
			}
			System.out.println();
		}

	}

}