package firstexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//hr������ job���̺��� �����ϴ� DAOŬ����
@Repository("jobdao")
public class JabDAO {
	@Autowired
	JdbcTemplate mytemplate;
	//job���̺��� ���ڵ� ������ �����ϴ� �޼ҵ�
	public int count(){
		return mytemplate.queryForObject("select count(*) from jobs", Integer.class);
		
	}
}
