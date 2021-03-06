package jdbc.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.board.exam.BoardDTO;
import jdbc.board.exam.DBUtil;

public class CustomerDAO {
	public int insert(CustomerDTO customer) {
		System.out.println("dto사용메소드"+customer);
		Connection con = null;
		PreparedStatement stmt = null;
		String sql = "insert into tb_board values(?,?,?,sysdate,0,?)";
		int result = 0; //메소드 실행결과가 저장될 변수
				try {
			System.out.println("드라이버 로딩 성공!!");
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, customer.getId());
			stmt.setString(2, customer.getPass());
			stmt.setString(3, customer.getName());
			stmt.setString(4, customer.getAddr());
			result = stmt.executeUpdate();
			System.out.println(result+"개 행 삽입성공");
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
		sql.append("delete customer");
		sql.append("where id = ?");
		int result = 0;
		try {
			System.out.println("드라이버 로딩 성공");
			 con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, id);
			result = stmt.executeUpdate();
			System.out.println(result+"개 행이 삭제됐습니다.");
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
		String sql = "update tb_board set addr = ? where id = ?";
		int result = 0;
		try {
			con = DBUtil.getConnect();//DBMS연결
			System.out.println("연결성공"+con);
			stmt = con.prepareStatement(sql);
			stmt.setString(1, addr);
			stmt.setString(2, id);
			result = stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();//오류추적
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;

	}
	

}
