package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req,
						HttpServletResponse res)
							throws ServletException,IOException{
		//1. ��û���� ����
		req.setCharacterEncoding("euc-kr");//���� ��ȯ�ϴ� ���..
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		
		System.out.println("���̵�:"+id);
		System.out.println("�н�����:"+pass);
	}
}
