package dept;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "list", urlPatterns = { "/dept/list.do"})
public class ListServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("���� ��ü��� ����??");
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		//1. ��û�޼���
		//2. �����Ͻ��޼ҵ� ȣ��
		DeptDAO dao = new DeptDAO();
		ArrayList<DeptDTO> deptlist = dao.getDeptList();
		//3. ������ ����
		request.setAttribute("deptlist", deptlist);
		RequestDispatcher rd = request.getRequestDispatcher("/dept/list.jsp");
		rd.forward(request, response);
		
	}

}
