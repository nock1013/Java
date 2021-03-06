package jdbc.member.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fw.DBUtil;

public class MemberDAOImpl implements MemberDAO{
	public int insert(MemberDTO user) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("insert into member values(?,?,?,?,?,sysdate,1000)");
		int result = 0;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, user.getId());
			stmt.setString(2, user.getPassword());
			stmt.setString(3, user.getName());
			stmt.setString(4, user.getAddr());
			stmt.setString(5, user.getDeptno());
			
			result = stmt.executeUpdate();
			System.out.println(result+"�� �� ���� ����");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
		
	}
	public int update(String id, String addr) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("update member set addr = ? where id = ?");
		int result = 0;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, addr);
			stmt.setString(2, id);
			result = stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
	public int delete(String id) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("delete member where id = ?");
		int result = 0;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, id);
			result = stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
	public ArrayList<MemberDTO> memberList(){
		ArrayList<MemberDTO> member = new ArrayList<MemberDTO>(); 
		MemberDTO mem = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select * from member");
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql.toString());
			rs = stmt.executeQuery();
			while(rs.next()) {
				mem = new MemberDTO(rs.getString(1),rs.getString(2),rs.getString(3),
									rs.getString(4),rs.getString(5),rs.getDate(6),
									rs.getInt(7));
				member.add(mem);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return member;
	}

	@Override
	public ArrayList<MemberDTO> fundByAddr(String addr) {
		ArrayList<MemberDTO>  fba = new ArrayList<>();
		MemberDTO ft = null;
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select * from member where addr like ?");
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, "%"+addr+"%");
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				ft = new MemberDTO(rs.getString(1),rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getString(5),rs.getDate(6),
						rs.getInt(7));
				fba.add(ft);
				}	
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		
		return fba;
	}
	@Override
	public MemberDTO login(String id, String pass) {
		StringBuffer sql = new StringBuffer();
		sql.append("select * from member where id = ? and pass = ?");
		MemberDTO mem = null;
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, id);
			stmt.setString(2, pass);
			rs = stmt.executeQuery();
			if(rs.next()) {
				mem = new MemberDTO(rs.getString(1),rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getString(5),rs.getDate(6),
						rs.getInt(7)); 
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return mem;
	}
	

}

