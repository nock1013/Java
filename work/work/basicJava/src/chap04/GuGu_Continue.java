package chap04;
//Continue�� ���� - ����� ��ġ �Ʒ��� �ڵ带 skip�ϱ� ���� ���.
public class GuGu_Continue {

	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++)
		{
			if(i == 5) {
				continue;
			}
			for(int j = 1; j <= 9; j++)
			{
				/*if(i == 5) { break���� ���� for�� ����Ǿ� �����Ƿ�
					break;	      �ݺ����� ��������� �ʴ´�.
				}*/
				System.out.print(i + " * " + j + " = " + i * j + "\t");
			}
			System.out.println();
		}
		
		/*for(int i = 1; i <= 9; i++)
		{
			for(int j = 2; j <= 9; j++)
			{
				System.out.print(j + " * " + i + " = " + i * j + "\t");
			}
			System.out.println();
		}*/

	}

}
