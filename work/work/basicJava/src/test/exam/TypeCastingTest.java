package test.exam;
public class TypeCastingTest  
{
	public static void main(String[] args) 
	{
		// �⺻������ ����ȯ
		// �ڵ�����ȯ(ū ������ Ÿ���� ������ ���� ������ Ÿ�� ������ �Ҵ�)
		byte b1 = 10;
		short s = b1;
		int i = s;
		long l = i;
		
		float f = l;
		double d = f;

		System.out.println(d);

		char c = 'A';
		System.out.println(c);

		//A�� Ascii���� ����� ���� ���
		int data = c;	// int = char : �ڵ�����ȯ
		System.out.println(data);


		// ����� ����ȯ 
		// �⺻������ ����� ����ȯ
		byte bytedata = (byte)200;
		System.out.println(bytedata);

		int intdata = 111;	
		// int -> char
		char chardata = (char)intdata;
		System.out.println((char)intdata);
		System.out.println((char)115);

		double doubledata = (double)20/100*100;
		System.out.println(doubledata);
	}
}
