package chap04;
// while�� ���� - ForTest01.java���� �۾��� ������ while������ ����
//"�ڹ� ���α׷���" 5�� ���
public class WhileTest01 {
	public static void main(String[] args)
	{
		int num = 0;
		
		while(num < 5)
		{
			num++;
			System.out.println("�ڹ� ���α׷���: " + num);
		}
		System.out.println("======================================");
		num = 0;
		while(true)
		{
			if(num >= 5) {
				break;
			}
			num++;
			System.out.println("�ڹ� ���α׷���: " + num);
		}
	}
}
