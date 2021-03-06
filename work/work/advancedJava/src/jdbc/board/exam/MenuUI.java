package jdbc.board.exam;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	BoardDAO dao = new BoardDAOImpl();
	public void insertMenu(){
		System.out.println("*******게시글등록********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("제목:");
		String title = key.next();
		System.out.print("내용:");
		String content = key.next();
		//여기에서 BoardDAO의 메소드를 호출하세요
		BoardDTO board = new BoardDTO(id, title, content);
		int result = dao.insert(board);
		//결과처리
		if(result>0) {
			System.out.println("게시글등록 성공");
		}else {
			System.out.println("글 등록 실패");
		}
				
	}
	public void updateMenu(){
		System.out.println("*******게시글수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("게시글번호:");
		int boardNum = key.nextInt();
		int result = dao.update(boardNum, id);
		if(result>0) {
			System.out.println("게시글수정 성공");
		}else {
			System.out.println("글 수정 실패");
		}
	}
	public void deleteMenu(){
		System.out.println("*******게시글삭제********");
		System.out.print("게시글번호:");
		int boardNum = key.nextInt();
		int result = dao.delete(boardNum);
		if(result>0) {
			System.out.println("게시글삭제 성공");
		}else {
			System.out.println("글 삭제 실패");
		}
		
		//여기에서 BoardDAO의 메소드를 호출하세요
	}
	public void searchMenu(){
		System.out.println("*******게시글검색********");
		System.out.print("제목:");
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
		System.out.println("*******게시글조회********");
		ArrayList<BoardDTO> boardlist = dao.select();
		int size = boardlist.size();
		for(int i=0;i<size;i++) {
			BoardDTO board = boardlist.get(i);
			System.out.println(board.getBoardNum()+"\t"+board.getTitle()+"\t"+
							   board.getId()+"\t"+board.getHit());	
		}
	}
	public void readMenu() {
		System.out.println("*******게시글상세보기********");
		System.out.print("게시글 번호:");
		int num = key.nextInt();
		BoardDTO board = dao.read(num);
		if(board==null) {
			System.out.println("조회된 데이터가 없습니다.");
		}else {
				System.out.println(board.getBoardNum()+"\t"+board.getTitle()+"\t"+
						   board.getContent()+"\t"+ board.getWriteDate()+"\t"+
						   board.getId()+"\t"+board.getHit());
		}
		
	}
}



















