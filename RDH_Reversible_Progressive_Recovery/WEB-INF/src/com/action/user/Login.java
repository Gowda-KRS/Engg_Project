/**
 * 
 */
package com.action.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.data.dao.DAO;
import com.data.dao.DAOFactory;


/**
 * @author Munna Kumar Singh
 */
public class Login extends HttpServlet 
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		PrintWriter out = response.getWriter();
		try
		{
			HttpSession session = request.getSession();
			String name=request.getParameter("name");
			String pass=request.getParameter("pass");
			DAOFactory factory=new DAOFactory();
			DAO dao=factory.getInstance("User");
			boolean result=dao.loginCHK(name, pass);
			if(result)
			{
				request.setAttribute("user", name);
				session.setAttribute("user", name);
				RequestDispatcher rd=request.getRequestDispatcher("/res/jsp/user/home.jsp");
				rd.forward(request, response);
			}
			else
				response.sendRedirect(request.getContextPath()+"?no=1");
		}
		catch(Exception e)
		{
			System.out.println("Opps's Error is in UserLogin Servlet : ");
			e.printStackTrace();
			out.println("Opps's Error is in UserLogin Servlet......"+e);
		}
	}
}
