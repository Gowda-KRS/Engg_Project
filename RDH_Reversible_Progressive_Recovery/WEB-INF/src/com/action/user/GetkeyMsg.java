package com.action.user;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.imageio.ImageIO;


import com.data.dao.User;
import com.user.util.AESCrypt;
import com.user.util.HideProcess;
import com.user.util.HideProcessMsgnew;
import com.user.util.ImageHideProcess;


/**
 * @author: Menaka
 * 
 * 
 */
public class GetkeyMsg extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
	
		HttpSession session = request.getSession();
		RequestDispatcher rd = null;
		String action = "";
		String username = "";
		String[] dataToHide =new String[3];
		String[] dataHidingKey =new String[3];
		String datasplit="";
		String inFilePath = "";
		String outFilePath = "";
		String fileName = "",filePath="";
		String ext = "";
		boolean flag = false;
		BufferedImage img = null;
		String imagename=null;
		String imagekey=null;
		
		try 
		{
			username = (String) session.getAttribute("user");
			ext = (String) session.getAttribute("file_ext");
			
			action = request.getParameter("action");
			
			
			if(action.equals("Cancel"))
			{
				System.out.println("The Data Hiding Process Canceled Successfully......");
				request.setAttribute("user",username);
				
				rd = getServletContext().getRequestDispatcher("/res/jsp/user/cancel.jsp");
				rd.forward(request, response);
			}
			
			if(action.equals("Save Image"))
			{
				System.out.println("Saving The Incrypted Image...........");
			
				filePath = "/Files/Encryption/enc_img."+ext;
				rd = getServletContext().getRequestDispatcher("/DownloadFile?file_path="+filePath);
				rd.forward(request, response);
			}
			
			if(action.equals("Hide Data"))
			{
				
				String checkAction = request.getParameter("act");
				
				
				if(checkAction.equals("HideData"))
				{
					rd=request.getRequestDispatcher("/res/jsp/user/hide_data.jsp");
					rd.forward(request, response);
				}
				else if(checkAction.equals("HideDataAction"))
				{
					System.out.println("Data Hiding Process is in Progress.....");
						
					
					 imagename= session.getAttribute("imagename").toString();
					 imagekey=session.getAttribute("imagekey").toString();
					
					
					System.out.println("****************** Data Hiding Information ****************");
					System.out.println("Data To Hide : " + dataToHide);
					
					System.out.println("Data Hiding Key : " + dataHidingKey);
					
					String textkey1=request.getParameter("hidingKey1");
					String textdata1=request.getParameter("textData1");
					String textkey2=request.getParameter("hidingKey2");
					String textdata2=request.getParameter("textData2");
					String textkey3=request.getParameter("hidingKey3");
					String textdata3=request.getParameter("textData3");
					
					datasplit=imagekey+"="+imagename+"~"+textkey1+"="+textdata1+"~"+textkey2+"="+textdata2+"~"+textkey3+"="+textdata3;
					
					String encryptedPassword = AESCrypt.encrypt(datasplit);
					
					User.insertuserdatakey(username,encryptedPassword,imagekey);
					
					
					inFilePath = request.getRealPath("")+"\\Files\\Encryption\\enc_img."+ext;
					outFilePath = request.getRealPath("")+"\\Files\\Encryption\\enc_img_data."+ext;
					
					img = HideProcess.readImage(inFilePath);
					//
						int length = datasplit.length();
						datasplit = length+"~"+datasplit;
					//
					flag = HideProcess.hideProcess(img,"????",datasplit,outFilePath);
					
					if(flag)
					{
						System.out.println("Data Hiding Process Done Successfully.... ");
						rd=request.getRequestDispatcher("/res/jsp/user/hide_data.jsp?no=1");
						rd.forward(request, response);
					}
					else
					{
						System.out.println("Opps,Something Went Wrong While Hiding The Data!!!!!");
						rd=request.getRequestDispatcher("/res/jsp/user/hide_data.jsp?no1=1");
						rd.forward(request, response);
					}
				}
				
				
				else if(checkAction.equals("Save File"))
				{
					System.out.println("Saving The Encrypted File With Data.....");
			
					filePath = "/Files/Encryption/enc_img_data."+ext;
					rd = getServletContext().getRequestDispatcher("/DownloadFile?file_path="+filePath);
					rd.forward(request, response);
				}
				
			}
			
			if(action.equals("Save"))
			{
				System.out.println("Saving The Decrypted File .....");
				filePath = "/Files/Decryption/dec_img."+ext;
				rd = getServletContext().getRequestDispatcher("/DownloadFile?file_path="+filePath);
				rd.forward(request, response);
				System.out.println("Decrypted File Downloaded Successfully......");
			}
			
		}
		catch (Exception e) 
		{
			System.out.println("Opps,Exception in User==>HideData Servlet : ");
			e.printStackTrace();
		}
		
	}
}
