package jdbc.basic;
//step 1 inser

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedInsertTest {
public static void main(String[] args) {
	    Scanner key = new Scanner(System.in);
		PreparedInsertTest obj = new PreparedInsertTest();
		System.out.println("********게시글 등록*************");
		System.out.print("아이디 :");
		String id = key.next();
		System.out.print("제목 :");
		String title = key.next();
		System.out.print("내용 :");
		String content = key.next();
		System.out.println();
		obj.insert(id, title, content);
	}
	public void insert(String id, String title, String content) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		//Statement방식(동적)
//		String sql = "insert into tb_board values(board_seq.nextval,'"+
//					id +"','"+title+"','"+content+"',sysdate,0)";
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";//preparedStatement방식(동적)
				try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!!");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공:"+con);
			//3. sql을 실행하기 위한 객체를 생성 - 연결정보와 연결시켜야 하므로
			//							  Connection객체를 이용해서 생성
			//1.PreparedStatement
			stmt = con.prepareStatement(sql);
			//2. ?에 값 전달하기
			stmt.setString(1, id);
			stmt.setString(2, title);
			stmt.setString(3, content);
			//3. 실행하기
			int result = stmt.executeUpdate();
			System.out.println("SQL을 실행하기 위한 객체정보:"+stmt);
			//4. sql실행하기
			System.out.println(result+"개 행 삽입성공");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(con!=null)con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
			
	}
	

}
