package chap05;

public class ArgsTest {

	public static void main(String[] args) {
		/*
		 * args = new String[2]
		 * 					---
		 * 					������ �Ű������� ������ŭ ����
		 * args[0] = "100";
		 * args[1] = "200";	
		*/
		System.out.println("������ �Ű����� -> " + args[0]);
		System.out.println("������ �Ű����� -> " + args[1]);
		
		for(int i = 0; i < args.length; i++)
		{
			System.out.println(args[i]);
		}
		//String���� �Է¹��� �Ű������� int�� ��ȯ
		//								String => int�� ��ȯ
		System.out.println("�� => " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));

		
	}

}