<%@page import="member.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	 //���� �������� ArrayList<DeptDTO>��ü ��������
	 ArrayList<MemberDTO> dto = (ArrayList<MemberDTO>)request.getAttribute("memlist");
	%>
	<%int size = dto.size(); %>
	<h1>�μ���Ϻ���</h1>
		<hr/>
		<table border='1' width = '500px'>
		<tr>
		<th>���̵�</th>
		<th>��й�ȣ</th>
		<th>�̸�</th>
		<th>�ּ�</th>
		<th>�μ���ȣ</th>
		<th>���</th>
		<th>����Ʈ</th>
		<th>����</th>
		</tr>
		
	 <% for(int i=0; i <size; i++) { 
			MemberDTO mem = dto.get(i);%>
		<tr>
			<td><%= mem.getId() %></td>
			<td><%= mem.getPass() %></td>
			<td><a href="/serverweb/member/read.do?id=<%=mem.getId() %>"><%=mem.getName()%></a></td>
			<td><%= mem.getAddr() %></td>
			<td><%= mem.getDeptNo()%></td>
			<td><%= mem.getGrade()%></td>
			<td><%= mem.getPoint()%></td>
			<td><a href="/serverweb/member/delete.do?id=<%= mem.getId() %>">����</a></td>
			</tr>
		<% }%>
</table>
</body>
</html>