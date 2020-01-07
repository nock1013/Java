package chap08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//API�� �޼ҵ带 ȣ���ϴ� ���
//1. API�� �޼ҵ带 ����� �� ����ο� throw �� �߰��Ǿ� ������ �ݵ�� try~catch�� ó���ؾ� �Ѵ�.
//2. RuntimeException�� ���� Exception�� throws�ϴ� ��쿡��
// 	 ���������� Exception�� ���� ó���� �ϵ��� �������� �ʴ´�.
//	 => �������� ���������� ������ Exception�� throws�ϰ� ������ ó���� �ؾ��Ѵ�.

public class ExceptionTest05 {

	public static void main(String[] args) {
		try {
		FileInputStream fs = new FileInputStream("test.txt");
		System.out.println(fs.read());
		System.out.println(Integer.parseInt("1234"));
		//System.out.println(Integer.parseInt("���ڿ�"));
		}catch(FileNotFoundException e) {
			
		}catch(IOException e) {
			System.out.println("������ ������ ������ �߻��߽��ϴ�.");
		}
			System.out.println("������ ã�� �� �����ϴ�.");
			//������ �ٽ� ������ �� �ֵ��� ó��
	}

}
