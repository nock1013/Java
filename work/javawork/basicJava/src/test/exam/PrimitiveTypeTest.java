package test.exam;
// �ڹ� �⺻�� �������� ���ͷ��� ���ؼ� ���캸�� ����
public class PrimitiveTypeTest  
{
	public static void main(String[] args) 
	{
		//boolean��
		boolean bool = true;
		System.out.println(bool);

		//������
		char c = 'a'; // char Ÿ�� ������ ���ͷ��� ǥ���� �� ''�� ǥ��
		System.out.println(c);

		//������
		//������������ �⺻���� �Ҵ�Ǵ� ���ͷ��� Ÿ���� int
		byte b = 127;			// byte = int
		System.out.println(b);

		short s = 32767;
		System.out.println(s);

		int i = 2147483647;      
		System.out.println(i);

		long l = 2147483648L;	// longŸ���� ��쿡�� ���̻� L�̳� l�� �߰��Ѵ�.      
		System.out.println(l);

		//�Ǽ���
		//�Ǽ��� ���ͷ��� �⺻ Ÿ���� double��
		float f = 10.5f;		//floatŸ���� ��쿡 F�� f�� �߰��Ѵ�.
		double d = 10.5;

		System.out.println(f);
		System.out.println(d);

		double d1 = 10/3.0;
		System.out.println(d1);
		
	}
}
