package jdbc.board.exam;

import java.util.Scanner;

import jdbc.basic.PreparedDeleteTest;
import jdbc.basic.PreparedInsertTest;
import jdbc.basic.PreparedUpdateTest;

public class BoardDAOTest {
	
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		BoardDAOImpl dao = new BoardDAOImpl();
		System.out.println("********����*************");
		System.out.print("���̵� :");
		String id = key.next();
		System.out.print("��ȣ :");
		int boardnum = key.nextInt();
		System.out.println();
		dao.update(boardnum, id);
	}
	
	
	/*public static void main(String[] args) {	
		Scanner key = new Scanner(System.in);
		BoardDAO dao = new BoardDAO();
		System.out.println("********����*************");
		System.out.print("��ȣ :");
		int boardnum = key.nextInt();
		System.out.println();
		dao.delete(boardnum);
	}*/
	

/*	public static void main(String[] args) {
	    Scanner key = new Scanner(System.in);
		BoardDAO dao = new BoardDAO();
		System.out.println("********�Խñ� ���*************");
		System.out.print("���̵� :");
		String id = key.next();
		System.out.print("���� :");
		String title = key.next();
		System.out.print("���� :");
		String content = key.next();
		System.out.println();
		dao.insert(id, title, content);
	}*/

}