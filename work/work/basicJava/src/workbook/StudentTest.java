package workbook;

public class StudentTest {

	public static void main(String[] args) {
		Student01[] students = new Student01[3];
		students[0] = new Student01("ȫ�浿", 15, 171, 81);
		students[1] = new Student01("�ѻ��", 13, 183, 72);
		students[2] = new Student01("ȫ�浿", 16, 175, 65);
		
		int avgAge = 0;
		int avgHeight = 0;
		int avgWeight = 0;
		
		System.out.println("�̸�\t����\t����\t������");
		for (int i = 0; i < students.length; i++) {
			students[i].print();
			avgAge += students[i].getAge();
			avgHeight += students[i].getHeight();
			avgWeight += students[i].getWeight();
		}
		
		System.out.println("������ ���: " + Math.round((float)avgAge / students.length * 100) / 100.0);
		System.out.println("������ ���: " + Math.round((float)avgHeight / students.length * 100) / 100.0);
		System.out.println("�������� ���: " + Math.round((float)avgWeight / students.length* 100) / 100.0);
	}

}
