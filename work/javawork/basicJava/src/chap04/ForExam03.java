package chap04;

public class ForExam03 {

	public static void main(String[] args) {
		
		int num = 0;
		int oddNum = 0;
		
		for(int i = 1; i <= 100; i++)
		{
			num += i;
			if(i % 2 != 0)
				oddNum += i;
		}
		System.out.println("��: " + num);
		System.out.println("Ȧ����: " + oddNum);
		System.out.println("¦����: " + (num - oddNum));
	}

}
