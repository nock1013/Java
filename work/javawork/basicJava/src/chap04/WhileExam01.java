package chap04;
// ForExam03.java�� while������ �����ϱ�
public class WhileExam01 {

	public static void main(String[] args) {
		
		int num = 0;
		int oddNum = 0;
		int i = 0;
		
		while(i < 100)
		{
			i++;
			num += i;
			
			if(i % 2 != 0)
			{
				oddNum += i;
			}
		}
		System.out.println("��: " + num);
		System.out.println("Ȧ����: " + oddNum);
		System.out.println("¦����: " + (num - oddNum));
	}

}
