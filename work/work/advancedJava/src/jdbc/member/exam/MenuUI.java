package jdbc.member.exam;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	MemberDAO dao = new MemberDAOImpl();
	public void insertMenu(){
		//�Ի����� ���� ��¥ - sysdate, point = 1000�� ���Եǵ���
		System.out.println("*******������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�н�����:");
		String pass = key.next();
		System.out.print("����:");
		String name = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		System.out.print("�μ���ȣ:");
		String deptno = key.next();
		MemberDTO user = new MemberDTO(id, pass, name, addr, deptno);
		int result = dao.insert(user);
		if(result>0) {
			System.out.println("�Խù���� ����");
		}else {
			System.out.println("�Խù���� ����");
		}
		
		
	}
	public void updateMenu(){
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		int result = dao.update(id, addr);
		if(result>0) {
			System.out.println("�Խù����� ����");
		}else {
			System.out.println("�Խù����� ����");
		}
	}
	public void deleteMenu(){
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		int result = dao.delete(id);
		if(result>0) {
			System.out.println("�Խù����� ����");
		}else {
			System.out.println("�Խù���������");
		}
	}
	public void findByAddrMenu(){
		System.out.println("*******����˻�********");
		System.out.print("�ּ�:");
		String addr = key.next();
		ArrayList<MemberDTO> member = dao.fundByAddr(addr);
		int size = member.size();
		for(int i=0;i<size;i++) {
			MemberDTO mem = member.get(i);
			System.out.println("���̵� :"+mem.getId()+"   ���:"+mem.getPassword()+"   �̸�"+mem.getName()+
					"   �ּ�: "+mem.getAddr()+"   �μ���ȣ :"+mem.getDeptno()+"   �Ի糯¥:"+mem.getDate()
						+"   ����Ʈ:"+mem.getPoint());
		}
	}
	
	
	public void selectMenu(){
		System.out.println("*******�����ȸ********");
		ArrayList<MemberDTO> member = dao.memberList();
		int size = member.size();
		for(int i=0; i<size;i++) {
			MemberDTO mem = member.get(i); 
			System.out.println("���̵� :"+mem.getId()+"   ���:"+mem.getPassword()+"   �̸�"+mem.getName()+
					"   �ּ�: "+mem.getAddr()+"   �μ���ȣ :"+mem.getDeptno()+"   �Ի糯¥:"+mem.getDate()
						+"   ����Ʈ:"+mem.getPoint());
		}
	}
	public void loginMenu() {
		System.out.println("*******�α��� Ȯ��********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�н�����:");
		String pass = key.next();
		MemberDTO mem = dao.login(id, pass);
		if(mem==null) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("���̵� :"+mem.getId()+"   ���:"+mem.getPassword()+"   �̸�"+mem.getName()+
					"   �ּ�: "+mem.getAddr()+"   �μ���ȣ :"+mem.getDeptno()+"   �Ի糯¥:"+mem.getDate()
						+"   ����Ʈ:"+mem.getPoint());
		}
		
	}
}

















