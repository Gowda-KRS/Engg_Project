package com.action.user;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;




public class Test extends HttpServlet
{

	@SuppressWarnings({ "deprecation", "unused" })
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
			{
		LinkedHashMap<String, String> data = new LinkedHashMap<>();	
		String ext="";
	    String NA="-NA-";
		
		String type ="";
		
		RequestDispatcher rd = null;
		String filepath="";
		
		
		
		HttpSession session = request.getSession();
		boolean flag=false;
		
	    
		
	//	int companycode=zeros;
		boolean flagff=false;
	
		String fileName =null;
		String[] name = new String[50];
		int i=0;
		String root = null;
		File uploadedFile = null;
		ArrayList<String> list = new ArrayList<String>();
		
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		
		String state="";
		
		
			try
			{
				
				
				FileItemFactory fileItemFactory = new DiskFileItemFactory();
				ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);
				List fileItems = servletFileUpload.parseRequest(request);
				
				
				
				
				Iterator iterator = fileItems.iterator();
				
				
				
				
				
				
				int s=fileItems.size();
				
				
				
				
				for(int j=0;j<s;j++)
				{
					FileItem one =(FileItem)fileItems.get(j);
					one.getFieldName();
					String str=one.getContentType();
					
				
					
					if(str=="application/octet-stream")
					{
						
						
					}
				
					
						 
						  data.put(one.getFieldName().toString(), one.getString().toString());
						
						
						 if(data.get(one.getFieldName().toString()).isEmpty() || data.get(one.getFieldName().toString())==null || data.get(one.getFieldName().toString()).equals("")||data.get(one.getFieldName().toString()).equals("Select") || data.get(one.getFieldName().toString()).equals("null"))
						 {
							 data.put(one.getFieldName().toString(), NA);
						 }
						
					
					 
				}
				type = (String) data.get("type");
				System.out.println("================+++++"+type);
				
				String decryption_key=request.getParameter("decryption_key");
			
				System.out.println("decryption_key"+decryption_key);
				
				
				 while (iterator.hasNext())
					{
					 System.out.println("<>>>>>>>>>>>>");
						FileItem item = (FileItem) iterator.next();
						long size=item.getSize();
						System.out.println("<>>>>>>>>"+size);
				
						if (item.isFormField())
						{
							System.out.println("<came inside loop>");
							
							
							
							
						} 
						else if(size!=0)
						{
							String format = "none";
							fileName = item.getName();
						
				//root = request.getContextPath()+("/UploadedFiles");
							ext=fileName.substring(fileName.lastIndexOf(".")+1,fileName.lastIndexOf(""));
		            		 filepath = request.getRealPath("")+"\\Files\\Decryption\\enc_img."+ext;
				
						

	                         File ff=new File(filepath);
	                         if (!ff.exists()) 
	                              {
	                                ff.mkdirs();
	                              }
							
							
							int index = fileName.lastIndexOf(".");
							if(index > 0)
							{
							               format = fileName.substring(index+1);
							               format = format.toLowerCase();
							}
							
							
							
							uploadedFile = new File(filepath);
							
						
							item.write(uploadedFile);
							 flag = true;
			  	             System.out.println("File Uploaded Successfully......");
			  	             session.setAttribute("file_ext",ext);
							
							
							
							String dir="";
					
			}
						
						
		}
				
				

			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			
		
		
		
			
		}
}

