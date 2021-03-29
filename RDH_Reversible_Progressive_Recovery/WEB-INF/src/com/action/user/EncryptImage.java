package com.action.user;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.user.util.ImageEncrypt;



public class EncryptImage extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		boolean flag = false;
		String s = "";
		String fileName = "";
		String ext="";
		String filepath = "";
		ArrayList list =  new ArrayList();
		
		String inFilePath = "";
		String outFilePath = "";
		String encKey = "";
		int xor = 0;
		BufferedImage img = null;
		RequestDispatcher rd = null;
		HttpSession session = request.getSession();
		
		try 
		{
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
			if(isMultipart)
 			{
 				FileItemFactory factory = new DiskFileItemFactory();
 	            ServletFileUpload upload = new ServletFileUpload(factory);
 	            
 	            try 
 	            {
 	            	List items = upload.parseRequest(request);
  	                Iterator iterator = items.iterator();
  	                while (iterator.hasNext()) 
  	                {
  	                	FileItem item = (FileItem) iterator.next();
  	                	
  	                	
	                    if (item.isFormField()) 
	                    {
	                    	s = item.getString();
	                    	list.add(s);//All Form Field Values
	                    	
	                    }
	                    else 
	                    {
	                    	 fileName = item.getName();
	                    	 if(fileName!="")
		                    		ext=fileName.substring(fileName.lastIndexOf(".")+1,fileName.lastIndexOf(""));
			          
	                    	 filepath = request.getRealPath("")+"\\Files\\Encryption\\in_img."+ext;
			  	             File f1=new File(filepath);
			  	             item.write(f1);
			  	             flag = true;
			  	             System.out.println("File Uploaded Successfully......");
			  	             session.setAttribute("file_ext",ext);
	                    }
	                        
  	                }
  	                
  	                encKey = list.get(0).toString();
  	                System.out.println("Image Encryption Key : " +encKey);
  	                
  	                session.setAttribute("imagename", "in_img." +ext);
  	                session.setAttribute("imagekey", encKey);
  	                
  	                
				}
 	            catch (Exception e)
 	            {
					System.out.println("Opps,Exception While Uploading The File : " );
					e.printStackTrace();
				}
 			}
			
			/* Encrypting The Uploaded File (Starts) */
			
			if(flag)
			{
				//Encrypting The File
				
				inFilePath = request.getRealPath("")+"\\Files\\Encryption\\in_img."+ext;
				outFilePath = request.getRealPath("")+"\\Files\\Encryption\\enc_img."+ext;
				xor = ImageEncrypt.XOR(encKey);
				img = ImageEncrypt.readImage(inFilePath);
				ImageEncrypt.processImage(img,xor,"Encrypt",outFilePath);
				System.out.println("Image Encrypted Successfully....");
				rd=request.getRequestDispatcher("/res/jsp/user/browse_image.jsp?no=1");
				rd.forward(request, response);
			}
			else
			{
				System.out.println("Opps,Something Went While Uploading The File!");
			}
			
			/* Encrypting The Uploaded File (Ends) */
			
		} 
		catch (Exception e) 
		{
			System.out.println("Opps,Exception In User==>EncryptImage Servlet : ");
			e.printStackTrace();
		}
	}
}
