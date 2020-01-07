package jdbc.customer;

import java.util.Scanner;

import jdbc.basic.PreparedDeleteTest;
import jdbc.basic.PreparedInsertTest;
import jdbc.basic.PreparedUpdateTest;
import jdbc.board.exam.MenuUI;

public class CustomerDAOTest {
	
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("******�Խ���********");
		System.out.println("1. ���");
		System.out.println("2. �Խñ�����ϼ���");
		System.out.println("3. �Խñۼ���");
		System.out.print("���ϴ� �۾��� �����ϼ���:");
		int choice  = key.nextInt();
		show(choice);
	}
	public static void show(int choice){
		MenuUI ui = new MenuUI();
		switch(choice){
			case 1:
				ui.insertMenu();
				break;
			case 2:
				ui.selectMenu();
				break;
			case 3:
				ui.updateMenu();
				break;
			case 4:
				ui.deleteMenu();
				break;
			case 5:
				ui.searchMenu();
				break;
		}
	}

}