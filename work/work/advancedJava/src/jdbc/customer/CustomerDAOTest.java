package jdbc.customer;

import java.util.Scanner;

import jdbc.basic.PreparedDeleteTest;
import jdbc.basic.PreparedInsertTest;
import jdbc.basic.PreparedUpdateTest;
import jdbc.board.exam.MenuUI;

public class CustomerDAOTest {
	
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("******게시판********");
		System.out.println("1. 등록");
		System.out.println("2. 게시글전목록수정");
		System.out.println("3. 게시글수정");
		System.out.print("원하는 작업을 선택하세요:");
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
