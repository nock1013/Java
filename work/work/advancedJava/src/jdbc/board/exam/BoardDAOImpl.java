package jdbc.board.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//tb_board테이블을 엑세스하는 기능이 정의된 클래스
public class BoardDAOImpl implements BoardDAO {
	private Object boardNum;
	public int insert(BoardDTO board) {
		System.out.println("dto사용메소드"+board);
		Connection con = null;
		PreparedStatement stmt = null;
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		int result = 0; //메소드 실행결과가 저장될 변수
				try {
			System.out.println("드라이버 로딩 성공!!");
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, board.getId());
			stmt.setString(2, board.getTitle());
			stmt.setString(3, board.getContent());
			
			result = stmt.executeUpdate();
			System.out.println(result+"개 행 삽입성공");
				}catch(SQLException e) {
			e.printStackTrace();
				}finally {
						DBUtil.close(null, stmt, con);
				}
				return result;
			
	}
	//조회한 결과를 ArrayList로 변환하여 리턴
	public ArrayList<BoardDTO> select() {
		//전체 게시글을 담을 Collection
		ArrayList<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		//조회한 게시글을 담을 객체
		//객체를 생성하지 않고 null로 초기화하는 이유
		// -> 데이터를 조회하는 작업을 하는 곳이 while문 내부이므로
		//  while문에서 조회된 레코드로  객체를 생성
		BoardDTO board = null;
		String sql = "select * from tb_board";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) { //=> 레코드를 조회하기 위해서는
				//1. 조회한 레코드의 컬럼을 읽어서 DTO로 변환하는 작업
				board = new BoardDTO(rs.getInt(1), rs.getString(2),rs.getString(3),
									rs.getString(4),rs.getDate(5),rs.getInt(6));
				//2. DTO로 변환된 레코드를 ArrayList에 추가
				boardlist.add(board);
														/*System.out.print(rs.getInt(1)+"\t");
														System.out.print(rs.getString(2)+"\t");
														System.out.print(rs.getString(3)+"\t");
														System.out.print(rs.getString("content")+"\t");
														System.out.print(rs.getDate(5)+"\t");
														System.out.println(rs.getInt(6)+"\t");*/
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return boardlist;
		
	}
	public int delete(int boardnum) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("delete tb_board ");
		sql.append("where boardnum = ?");
		int result = 0;
		try {
			System.out.println("드라이버 로딩 성공");
			 con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql.toString());
			stmt.setInt(1, boardnum);
			result = stmt.executeUpdate();
			System.out.println(result+"개 행이 삭제됐습니다.");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
	public int update(int boardnum, String id) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "update tb_board set id = ? where boardnum = ?";
		int result = 0;
		try {
			con = DBUtil.getConnect();//DBMS연결
			System.out.println("연결성공"+con);
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setInt(2, boardnum);
			result = stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();//오류추적
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;

	}
	public int insert(String id, String title, String content) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		int result = 0; //메소드 실행결과가 저장될 변수
		try {
			System.out.println("드라이버 로딩 성공!!");
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, title);
			stmt.setString(3, content);
			
			result = stmt.executeUpdate();
			System.out.println("SQL을 실행하기 위한 객체정보:"+stmt);
			
			System.out.println(result+"개 행 삽입성공");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
			
	}
	@Override
	public BoardDTO read(int boardNum) {
		String sql = "select * from tb_board where boardnum=?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		BoardDTO board = null;
		try {
		con = DBUtil.getConnect();
		stmt = con.prepareStatement(sql);
		stmt.setInt(1, boardNum);
		rs = stmt.executeQuery();
		if(rs.next()) {
			board = new BoardDTO(rs.getInt(1),rs.getString(2),rs.getNString(3),rs.getString(4),
					rs.getDate(5),rs.getInt(6));
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
			return board;
		}
		@Override
	public ArrayList<BoardDTO> findByTitle(String title) {
		ArrayList<BoardDTO> fbt = new ArrayList<BoardDTO>();
		BoardDTO ft = null;
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql =  "select * from tb_board where title like ?";
		//String like = new String("%"+title+"%");
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, "%"+title+"%");
			rs = stmt.executeQuery();
			while(rs.next()) {
				ft = new BoardDTO(rs.getInt(1), rs.getString(2),rs.getString(3),
								  rs.getString(4),rs.getDate(5),rs.getInt(6));
				fbt.add(ft);
				}	
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				DBUtil.close(null, stmt, con);
			}
		return fbt;
	}
}
