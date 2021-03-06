package jdbc.member.exam;

import java.sql.Date;

public class MemberDTO {
	private String id;
	private String password;
	private String name;
	private String addr;
	private String deptno;
	private Date date;
	private int point;

	public MemberDTO() {
		
	}
	//insert��
	public MemberDTO(String id, String password, String name, String addr, String deptno) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.addr = addr;
		this.deptno = deptno;
	}
	//select��
	public MemberDTO(String id, String password, String name, String addr, String deptno, Date date, int point) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.addr = addr;
		this.deptno = deptno;
		this.date = date;
		this.point = point;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", password=" + password + ", name=" + name + ", addr=" + addr + ", deptno="
				+ deptno + ", date=" + date + ", point=" + point + "]";
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
}