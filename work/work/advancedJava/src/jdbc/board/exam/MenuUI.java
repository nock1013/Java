package jdbc.board.exam;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	BoardDAO dao = new BoardDAOImpl();
	public void insertMenu(){
		System.out.println("*******�Խñ۵��********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("����:");
		String title = key.next();
		System.out.print("����:");
		String content = key.next();
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
		BoardDTO board = new BoardDTO(id, title, content);
		int result = dao.insert(board);
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
		int boardNum = key.nextInt();
		int result = dao.update(boardNum, id);
		if(result>0) {
			System.out.println("�Խñۼ��� ����");
		}else {
			System.out.println("�� ���� ����");
		}
	}
	public void deleteMenu(){
		System.out.println("*******�Խñۻ���********");
		System.out.print("�Խñ۹�ȣ:");
		int boardNum = key.nextInt();
		int result = dao.delete(boardNum);
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
		ArrayList<BoardDTO> findBy = dao.findByTitle(title);
		int size = findBy.size();
		for(int i=0;i<size;i++) {
			BoardDTO find = findBy.get(i);
			System.out.println(find.getBoardNum()+"\t"+find.getTitle()+"\t"+
					find.getId()+"\t"+find.getHit());
		}
	}
	
	
	public void selectMenu(){
		System.out.println("*******�Խñ���ȸ********");
		ArrayList<BoardDTO> boardlist = dao.select();
		int size = boardlist.size();
		for(int i=0;i<size;i++) {
			BoardDTO board = boardlist.get(i);
			System.out.println(board.getBoardNum()+"\t"+board.getTitle()+"\t"+
							   board.getId()+"\t"+board.getHit());	
		}
	}
	public void readMenu() {
		System.out.println("*******�Խñۻ󼼺���********");
		System.out.print("�Խñ� ��ȣ:");
		int num = key.nextInt();
		BoardDTO board = dao.read(num);
		if(board==null) {
			System.out.println("��ȸ�� �����Ͱ� �����ϴ�.");
		}else {
				System.out.println(board.getBoardNum()+"\t"+board.getTitle()+"\t"+
						   board.getContent()+"\t"+ board.getWriteDate()+"\t"+
						   board.getId()+"\t"+board.getHit());
		}
		
	}
}


















