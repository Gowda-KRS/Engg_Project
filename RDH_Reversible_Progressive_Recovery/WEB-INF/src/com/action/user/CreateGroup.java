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
import com.data.dao.User;

public class CreateGroup extends HttpServlet 
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		PrintWriter out = response.getWriter();
		try
		{
			String task=request.getParameter("task");
			if(task.equalsIgnoreCase("delete"))
			{
				String grp_in=request.getParameter("grp_in");
				String grp_uid=request.getParameter("grp_uid");
				boolean result=User.rmvGrp(grp_in, grp_uid);
				if(result)
				{
					User.update(grp_uid, grp_in, grp_uid+" Has Deleted You From Group");
					RequestDispatcher rd=request.getRequestDispatcher("/GroupDetails?name="+grp_uid);
					rd.forward(request, response);
				}
			}
			else if(task.equalsIgnoreCase("Accept"))
			{
				String from=request.getParameter("from");
				String to=request.getParameter("to");
				boolean result=User.processRequest(from, to);
				if(result)
				{
					User.changeStatus(from, to, "accepted");
					User.update(to, from, to+" Has Accepted Your Request");
					response.sendRedirect(request.getContextPath()+"/Resources/JSP/User/request.jsp?user="+to);
				}
			}
			else if(task.equalsIgnoreCase("Reject"))
			{
				String from=request.getParameter("from");
				String to=request.getParameter("to");
				User.changeStatus(from, to, "rejected");
				User.update(to, from, to+" Has Denied Your Request");
				response.sendRedirect(request.getContextPath()+"/Resources/JSP/User/request.jsp?user="+to);
			}
		}
		catch(Exception e)
		{
			System.out.println("Opps's Error is in GroupDetails Servlet......"+e);
			out.println("Opps's Error is in GroupDetails Servlet......"+e);
		}
	}
}