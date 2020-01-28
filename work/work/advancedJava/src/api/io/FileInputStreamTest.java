package api.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//advancedJava������Ʈ���� �Ʒ� ����� test.txt�� ������ �о �ֿܼ� ����ϱ�
public class FileInputStreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			//1.���Ͽ����ϱ�
			fis = new FileInputStream("test.txt");
			//2. ���Ͼ׼���
			while(true) {
				int data = fis.read();
				if(data==-1) {
					break;
				}
				System.out.print((char)data);
			}
		}catch(FileNotFoundException e) {
				e.printStackTrace();
		}catch (IOException e) {
				e.printStackTrace();
		}finally {
				//3. ���ϴݱ�
			try {
				if(fis!=null)fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}