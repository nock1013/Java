package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//����Ŭ�� �����ϱ�
public class UpdateTest {
	//127.0.0.1 = localhost = ���� �۾����� �� PC
	public static void main(String[] args) {
		//���� ���ڿ� - � DBMS�� �����Ŀ� ���� ������ �޶�����.
		//���ݿ� �ִ� ���� DB���� ip
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		//���Ӱ���
		String user = "scott";
		//������ ������ �н�����
		String password = "tiger";
		//String sql = 
		//"Update tb_board set id='kang' where boardnum=2";
		//sql���� ���� ���� �������ش�.
		String sql = "update tb_board ";
		sql = sql + "set id='kang' ";
		sql = sql + "where boardnum=2";
		
		
		
		try {
			//1. ����Ŭ ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹��ε� ����!!");
			//2. DBMS�� �����ϱ� - ���������� ����
			//==>DBMS�� �����ϰ� ���������� ConnectionŸ������ ��ȯ�Ѵ�.
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("���� ����!!"+con);
			//3. sql�� �����ϱ� ���� ��ü�� ���� - ���������� �����Ű�� �ϹǷ�
			//Connection��ü�� �̿��ؼ� ����
			Statement stmt = con.createStatement();
			System.out.println("SQL�� �����ϱ� ���� ��ü����:"+stmt);
			//4. SQL �����ϱ�
			int result = stmt.executeUpdate(sql);
			//5. ���ó���ϱ�
			System.out.println(result+"�� ���� �����ƽ��ϴ�.");
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̹��ε� ����!!");
		} catch (SQLException e) {
			System.out.println("���� ����:"+e.getMessage());
		}
	}
}
