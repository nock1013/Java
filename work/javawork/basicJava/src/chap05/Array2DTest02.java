package chap05;
// 2���� �迭�� ����� ���� - �����迭
public class Array2DTest02 {

	public static void main(String[] args) {
		// 2���� �迭���� �迭�� �����ϴ� �迭�� ��Ҹ� ���� �ٸ��� ������ �� �ִ�.
		int[][] myArr = new int[3][];
		myArr[0] = new int[3];
		myArr[1] = new int[2];
		myArr[2] = new int[1];
		
		for(int i = 0; i < myArr.length; i++)
		{
			for(int j = 0; j < myArr[i].length; j++)
			{
				System.out.print(myArr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
