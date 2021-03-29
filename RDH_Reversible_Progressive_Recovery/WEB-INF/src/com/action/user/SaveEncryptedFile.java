/**
 @Author : Munna Kumar Singh
 Date : Apr 16, 2013
 File : SaveEncryptedFile.java
 Package : com.action.user
*/

package com.action.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveEncryptedFile extends HttpServlet
{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException 
	{
		PrintWriter out = resp.getWriter();
		
		try 
		{
			System.out.println("Down Loding The Encrypted File..........");
			System.out.println("99999999999999999999999999999999999999999999");
		} 
		catch (Exception e) 
		{
			System.out.println("Opps,Exception In User==>SaveEncryptedFile Servlet : ");
			e.printStackTrace();
			out.println("Opps,Exception In User==>SaveEncryptedFile Servlet : "+e);
		}
	}
}

