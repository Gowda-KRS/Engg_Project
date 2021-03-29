package com.action.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.data.dao.DAO;
import com.data.dao.DAOFactory;

public class Home extends HttpServlet 
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException 
	{
		PrintWriter out=response.getWriter();
		try
		{
			String name=request.getParameter("name");
			DAOFactory factory=new DAOFactory();
			DAO dao=factory.getInstance("Admin");
			ResultSet rs=dao.getProfile(name);
			if(rs.next())
			{
				rs=dao.getProfile(name);
				request.setAttribute("rs",rs);
				request.setAttribute("admin", name);
				RequestDispatcher rd=request.getRequestDispatcher("/res/jsp/admin/home.jsp");
				rd.forward(request, response);
			}
			else
				response.sendRedirect(request.getContextPath()+"/res/jsp/admin/profile.jsp?no=1");
			
		}
		catch(Exception e)
		{
			System.out.println("Opps's Error is in AdminProfile Servlet......"+e);
			out.println("Opps's Error is in AdminProfile Servlet......"+e);
		}
	}
}