package org.nuc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nuc.dao.IEmployeeDao;
import org.nuc.dao.impl.EmployeeDaoImpl;

public class DeleteAgreement extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		IEmployeeDao deleteemployee = new EmployeeDaoImpl();
		boolean result = deleteemployee.deleteEmployeeByID(id);
		if(result) {
			out.print("ɾ���ɹ�");
			out.print("<br><a href=\"personal.jsp\" target=\"show\"><font size=\"4\">�˳�</font></a>");
		}else {
			out.print("ɾ��ʧ��");
			out.print("<br><a href=\"personal.jsp\" target=\"show\"><font size=\"4\">�˳�</font></a>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
