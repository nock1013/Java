package chap03;
//�񱳿����� ||, && (���� ������) - ��� ���� �˻����� �ʰ� ���ǿ� �����ϸ� skip�ϴ� ��찡 �߻�
public class OprTest04_short {
	public static void main(String[] args) {
		int num = 100;
		String str = null;	// ���� str�� �ƹ��͵� ������� ���� ����
		//str.length();
		//||�����ڴ� or�������� Ư���� �ľ��ϰ� ù ��° ���� true�� ���� ���� �˻� x
		System.out.println(num >= 100 || str.length() > 10);
		//System.out.println(num >= 100 | str.length() > 10);
		
		//&&�����ڴ� and�������� Ư���� �ľ��ϰ� ù ��° ���� false�� ���� ���� �˻� x
		System.out.println(num < 100 && str.length() > 10);
		//System.out.println(num < 100 & str.length() > 10);
	}

}
