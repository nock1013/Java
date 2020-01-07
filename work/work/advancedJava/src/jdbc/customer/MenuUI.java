package jdbc.customer;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	CustomerDAO dao = new CustomerDAO();
	public void insertMenu(){
		System.out.println("*******�Խñ۵��********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("��й�ȣ:");
		String pass = key.next();
		System.out.print("�̸�:");
		String name = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
		CustomerDTO  customer = new CustomerDTO(id,pass,name,addr);
		int result = dao.insert(customer);
		//���ó��
		if(result>0) {
			System.out.println("�Խñ۵�� ����");
		}else {
			System.out.println("�� ��� ����");
		}
				
	}
	public void updateMenu(){
		System.out.println("*******�Խñۼ���********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�Խñ۹�ȣ:");
		String addr = key.next();
		int result = dao.update (id,addr);
		if(result>0) {
			System.out.println("�Խñۼ��� ����");
		}else {
			System.out.println("�� ���� ����");
		}
	}
	public void deleteMenu(){
		System.out.println("*******�Խñۻ���********");
		System.out.print("�Խñ۹�ȣ:");
		String id = key.next();
		int result = dao.delete(id);
		if(result>0) {
			System.out.println("�Խñۻ��� ����");
		}else {
			System.out.println("�� ���� ����");
		}
		
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
	}
	public void searchMenu(){
		System.out.println("*******�Խñ۰˻�********");
		System.out.print("����:");
		String title = key.next();
		
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
	}
	
	
	public void selectMenu(){
		System.out.println("*******�Խñ���ȸ********");
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ��� - ��ü�����ȸ
	}
}

















