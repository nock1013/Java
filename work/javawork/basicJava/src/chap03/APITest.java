package chap03;					// chap03 ������ �ۼ��ϰ� �� �ȿ� APITest.class�� �����Ѵ�.

import java.io.File;
import java.util.Random;

//import java.io.*;				// �⺻���� �ν��ϴ� package�� java.lang,
								// ���� �ٸ� ��Ű���� �����ϴ� Ŭ������ ����ϴ� ��� 
								// � ��Ű���� �ִ��� �νĽ�Ű�� �۾��� �ؾ��Ѵ�.
//import java.util.*;			// Random Ŭ������ �νĽ�Ű�� �۾�

//API ����ϱ� - ������ ���� ����
public class APITest {

	public static void main(String[] args) {
		// 1. API���� �����ϴ� Ŭ������ �ڹ� ���α׷� �ȿ��� ����ϱ� ���� �޸𸮿� �ø��� �۾�
		//	   �ø��� �۾� - JVM�� �ν��ϴ� �۾� ������ �Ҵ�
		// ����� Ŭ������ ���� = new ����� Ŭ���� ��();
		// -----------
		// Ÿ������ ����
		String str = new String();
		StringBuffer strBuffer = new StringBuffer();
		File file = new File("text.txt");
		Random rand = new Random();
		//ArrayList list = new ArrayList();
		
		// 2. ��ü(Ŭ������ ����ϱ� ���� �޸𸮿� �÷����� ��)�� �޼��� ����ϱ�
		//    -> �ν��ͽ���� ��
		//	  charAt�� �������� charŸ���̱� ������ ���� Ÿ���� ������ �����ؼ� ����
		String str2 = new String("java programing");
		char returnValue = str2.charAt(0);
		System.out.println("������ => " + returnValue);
		
		// I love you��� ���ڿ��� �̿��ؼ� String ��ü�� �����ϰ�
		// �� ���ڿ��� ���̸� ������ ���� �������� ����ϼ���
		
		String str3 = new String("I love you");
		System.out.println("���ڿ��� ���� => " + str3.length());
		
	}

}
