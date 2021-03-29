package com.action.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.data.dao.DAO;
import com.data.dao.DAOFactory;

public class GroupDetails extends HttpServlet 
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		PrintWriter out = response.getWriter();
		try
		{
			String user=request.getParameter("name");
			DAOFactory factory=new DAOFactory();
			DAO dao=factory.getInstance("User");
			ResultSet rs=dao.getUsers(user);
			request.setAttribute("rs",rs);
			request.setAttribute("user", user);
			RequestDispatcher rd=request.getRequestDispatcher("/Resources/JSP/User/group-details.jsp");
			rd.forward(request, response);
		}
		catch(Exception e)
		{
			System.out.println("Opps's Error is in GroupDetails Servlet......"+e);
			out.println("Opps's Error is in GroupDetails Servlet......"+e);
		}
	}
}