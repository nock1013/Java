package chap05;
// �迭 �������ϱ�
public class ArrayTest03 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		// �迭�� ����� ũ�⸦ ���
		System.out.println("�迭 ����� ����: " + arr.length);
		System.out.println("==================================");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}

}
