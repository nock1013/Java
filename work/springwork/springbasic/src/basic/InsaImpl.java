package basic;
public class InsaImpl implements Insa {
	MemberDAO dao;
	//1. �����ڸ� �̿��ؼ� �۾�
	public InsaImpl() {//�⺻������
		
	}
	//2. setter�޼ҵ带 �̿��ؼ� �۾��ϴ� ���
	
	
	@Override
	public void addUser(MemberDTO user) {
		dao.add(user);
	}

	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}


	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}

}
