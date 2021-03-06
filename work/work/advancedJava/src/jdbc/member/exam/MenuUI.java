package jdbc.member.exam;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	MemberDAO dao = new MemberDAOImpl();
	public void insertMenu(){
		//입사일은 오늘 날짜 - sysdate, point = 1000가 삽입되도록
		System.out.println("*******사원등록********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("패스워드:");
		String pass = key.next();
		System.out.print("성명:");
		String name = key.next();
		System.out.print("주소:");
		String addr = key.next();
		System.out.print("부서번호:");
		String deptno = key.next();
		MemberDTO user = new MemberDTO(id, pass, name, addr, deptno);
		int result = dao.insert(user);
		if(result>0) {
			System.out.println("게시물등록 성공");
		}else {
			System.out.println("게시물등록 실패");
		}
		
		
	}
	public void updateMenu(){
		System.out.println("*******사원수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("주소:");
		String addr = key.next();
		int result = dao.update(id, addr);
		if(result>0) {
			System.out.println("게시물수정 성공");
		}else {
			System.out.println("게시물수정 실패");
		}
	}
	public void deleteMenu(){
		System.out.println("*******사원삭제********");
		System.out.print("아이디:");
		String id = key.next();
		int result = dao.delete(id);
		if(result>0) {
			System.out.println("게시물삭제 성공");
		}else {
			System.out.println("게시물삭제실패");
		}
	}
	public void findByAddrMenu(){
		System.out.println("*******사원검색********");
		System.out.print("주소:");
		String addr = key.next();
		ArrayList<MemberDTO> member = dao.fundByAddr(addr);
		int size = member.size();
		for(int i=0;i<size;i++) {
			MemberDTO mem = member.get(i);
			System.out.println("아이디 :"+mem.getId()+"   비번:"+mem.getPassword()+"   이름"+mem.getName()+
					"   주소: "+mem.getAddr()+"   부서번호 :"+mem.getDeptno()+"   입사날짜:"+mem.getDate()
						+"   포인트:"+mem.getPoint());
		}
	}
	
	
	public void selectMenu(){
		System.out.println("*******사원조회********");
		ArrayList<MemberDTO> member = dao.memberList();
		int size = member.size();
		for(int i=0; i<size;i++) {
			MemberDTO mem = member.get(i); 
			System.out.println("아이디 :"+mem.getId()+"   비번:"+mem.getPassword()+"   이름"+mem.getName()+
					"   주소: "+mem.getAddr()+"   부서번호 :"+mem.getDeptno()+"   입사날짜:"+mem.getDate()
						+"   포인트:"+mem.getPoint());
		}
	}
	public void loginMenu() {
		System.out.println("*******로그인 확인********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("패스워드:");
		String pass = key.next();
		MemberDTO mem = dao.login(id, pass);
		if(mem==null) {
			System.out.println("로그인 실패");
		}else {
			System.out.println("아이디 :"+mem.getId()+"   비번:"+mem.getPassword()+"   이름"+mem.getName()+
					"   주소: "+mem.getAddr()+"   부서번호 :"+mem.getDeptno()+"   입사날짜:"+mem.getDate()
						+"   포인트:"+mem.getPoint());
		}
		
	}
}


















