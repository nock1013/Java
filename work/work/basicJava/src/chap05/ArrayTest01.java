package chap05;
// �迭�� ���� ���� - ����ϴ� ���
public class ArrayTest01 {

	public static void main(String[] args) {
		// 1. �迭�� ����
		int[] arr;
		int[] arr2;
		// 2. �迭�� ����
		arr = new int[5];
		arr2 = new int[5];
		
		System.out.println(arr);
		System.out.println(arr2);
		System.out.println("arr�� 2�� ����� �� => " + arr[2]);
		
		// 3. �迭�� �ʱ�ȭ - 2�� ��ҿ� 100�� ����
		arr[2] = 100;
		System.out.println("arr�� 2�� ����� �� => " + arr[2]);
		
		// �迭�� ����� ������ �Ѳ����� ó��
		int[] numArray = new int[3];
		boolean[] boolArr = new boolean[5];
		long[] longArr = new long[100];
		double[] doubleArr = new double[100];
		
		// �迭�� �⺻ �ʱⰪ
		// �⺻���� ��� 
		// ������ - 0
		// boolean - false
		// �Ǽ��� - 0.0
		System.out.println(numArray[0]);
		System.out.println(boolArr[0]);
		System.out.println(longArr[0]);
		System.out.println(doubleArr[0]);
	}

}
