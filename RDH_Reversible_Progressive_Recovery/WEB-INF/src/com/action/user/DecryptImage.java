/**
 * 
 */
package com.action.user;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
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

import com.data.dao.User;
import com.user.util.AESCrypt;
import com.user.util.HideProcess;
import com.user.util.HideProcessMsgnew;
import com.user.util.ImageEncrypt;


/**
 * @author Munna Kumar Singh
 * 
 * Modified : menaka
 */
public class DecryptImage extends HttpServlet 
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		LinkedHashMap<String, String> data = new LinkedHashMap<>();	
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = null;
		
		System.out.println("Hellooooooooooooooooooooooooooo");
		try
		{
			String  type="";
			String  decryption_key="";
			String  extraction_key1="";
			String  extraction_key2="";
		
			ArrayList list =  new ArrayList();
			
			/*String s = "";*/
			String fileName="";
			String ext="";
			String root="";
			String filepath = "";
			String inFilePath = "";
			String outFilePath = "";
			String decKey = "";
			
			String extractionKey = "";
			String extractedData = "";
			int xor = 0;
			BufferedImage img = null;
			
			HttpSession session = request.getSession();
			boolean flag=false;
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
			if(isMultipart)
			{
				//==========================================================================
				try{
					
					
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
								 data.put(one.getFieldName().toString(), "NA");
							 }
							
						
						 
					}
					
					  type=(String) data.get("type");
					  decryption_key=(String) data.get("decryption_key");
					  extraction_key1=(String) data.get("extraction_key1");
					  if(extraction_key1.equals("NA"))
					  {
						  extraction_key1=(String) data.get("extraction_key2");
					  }
					 
					
					System.out.println("<<<<<<<<<<<ext_key>>>>>>>>>>>>>"+type);
					System.out.println("<<<<<<<<<<<decryption_key>>>>>>>>>>>>>"+decryption_key);
					System.out.println("<<<<<<<<<<<extraction_key>>>>>>>>>>>>>"+extraction_key1);
					System.out.println("<<<<<<<<<<<extraction_key2>>>>>>>>>>>>>"+extraction_key2);
					
					
					 while (iterator.hasNext())
						{
							FileItem item = (FileItem) iterator.next();
							long size=item.getSize();
					
							if (item.isFormField())
							{
								
							} 
							else if(size!=0)
							{

			            	 	System.out.println("its came inside else block");
			            		 fileName = item.getName();
			            		 if(fileName!="")
			                    		ext=fileName.substring(fileName.lastIndexOf(".")+1,fileName.lastIndexOf(""));
			            		 filepath = request.getRealPath("")+"\\Files\\Decryption\\enc_img."+ext;
				  	             File f1=new File(filepath);
				  	             item.write(f1);
				  	             flag = true;
				  	             System.out.println("File Uploaded Successfully......");
				  	             session.setAttribute("file_ext",ext);
						
				}
					
					
					
					
					
					
					
					
				}
				}
				catch(Exception e)
				{
					
					e.printStackTrace();
				}
					
					
					//===================================================================================
				
				
				
				
				
				
				
				
				
				
				System.out.println("its came inside maltipart");
				FileItemFactory factory = new DiskFileItemFactory();
				ServletFileUpload upload = new ServletFileUpload(factory);
		        try
		        {
		        	System.out.println("its came inside try block");
		          	List items = upload.parseRequest(request);
		          	System.out.println("items"+items);
		          	Iterator iterator = items.iterator();
		          	System.out.println("iterator"+iterator);
		            /*while (iterator.hasNext()) 
		            {
		            	
		            	FileItem item = (FileItem) iterator.next();
		            	System.out.println("FileItem"+item);
		            	if (item.isFormField()) 
		            	{
		                	System.out.println("its came inside while block");
		            		s = item.getString();
		            		System.out.println("<<<<<<<<<<>>>>>>>>>>"+s);
	                    	list.add(s);//All Form Field Values
		            	}
		            	else 
		            	{
		            		
		            	 	System.out.println("its came inside else block");
		            		 fileName = item.getName();
		            		 if(fileName!="")
		                    		ext=fileName.substring(fileName.lastIndexOf(".")+1,fileName.lastIndexOf(""));
		            		 filepath = request.getRealPath("")+"\\Files\\Decryption\\enc_img."+ext;
			  	             File f1=new File(filepath);
			  	             item.write(f1);
			  	             flag = true;
			  	             System.out.println("File Uploaded Successfully......");
			  	             session.setAttribute("file_ext",ext);
		            	}
		            	
		            }
		           
		            System.out.println("******* Decrypt Image Information *******");
		            System.out.println("File Name : " + fileName);
		            System.out.println("Form Field Data : " + list);
		            
		            String data=""; 
		     for(int i=0;i<list.size();i++)
		     {
		    	 
		    	 data= (String) list.get(i);
		    	 
		    	 System.out.println("list contents are>>>>>>>>>>>>"+data);
		    	 
		     }
		            */
		            
		            /*System.out.println("formssssssss"+list.get(0));*/
		            
		            
		        }
		        catch(Exception e)
		        {
		        	System.out.println("Opps's Error is in User==>DecryptImage Servlet inside isMultipart Block : ");
		        	e.printStackTrace();
		        	out.println("Opps's Error is in User==>DecryptImage Servlet inside isMultipart Block : "+e);
		        }
			}
			
			/* Decrypting The File (Starts) */
			
			if(flag)
			{
				
				//Decrepting The Encrepted Image having Text Data
				System.out.println("<<<<<<<<>>>>>>>>>>");
				inFilePath = request.getRealPath("")+"\\Files\\Decryption\\enc_img."+ext;
				System.out.println("<inFilePath>>>>>>>>>>>"+inFilePath);
				outFilePath = request.getRealPath("")+"\\Files\\Decryption\\dec_img."+ext;
				System.out.println("<<<>>>>>>>>>>"+outFilePath);
				
				
				if( type.equals("dec_key"))
				{
					
				
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>dec_key image");
					decKey = decryption_key;
					System.out.println("Image Decryption Key : " + decKey);
					
					String uid=session.getAttribute("user").toString();
					String userkeydata=User.imagekey(uid) ;
					
					if(decKey.equals(userkeydata))
					{
					
					
					xor = ImageEncrypt.XOR(decKey);
					img = ImageEncrypt.readImage(inFilePath);
					
					
					
					
					ImageEncrypt.processImage(img,xor,"Decrypt",outFilePath);
					System.out.println("Image Decrypted Successfully....");
					
					rd=request.getRequestDispatcher("/res/jsp/user/browse_enc_image.jsp?no=1");
					rd.forward(request, response);
					}
					else
					{
						rd=request.getRequestDispatcher("/res/jsp/user/browse_enc_image.jsp?no1=2");
						rd.forward(request, response);
					}
					
					
					
					
				}
				/*else if(list.get(3).toString().equals("ext_key"))
				{
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~????????????????????????????????????");
					// Extracting The Text Data From Encrypted Img
					extractionKey = list.get(1).toString();
					System.out.println("Data Extraction Key : " + extractionKey);
					
					inFilePath = request.getRealPath("")+"\\Files\\Decryption\\enc_img."+ext;
					img = ImageEncrypt.readImage(inFilePath);
					extractedData = HideProcess.extractProcess(img,extractionKey,6);
					//
				     String msgLen="6";
				     int msgSize=0;
				     int msgLength =6;
				     
				     String[] info = extractedData.split("~"); 
				     
				     if(info.length > 0)
				     {
				    	 msgLen = info[0];
				    	 msgLength = Integer.parseInt(msgLen);
				    	 msgSize = msgLen.length();
				    	 msgSize = msgSize+1;
				    	 msgLength = msgLength+msgSize;
				    	 
				     }
				     extractedData = HideProcess.extractProcess(img,extractionKey,msgLength);
				     extractedData = extractedData.substring(msgSize,msgLength);
				     
				//
				
					session.setAttribute("ext_data",extractedData);
					
					
					
					
					rd=request.getRequestDispatcher("/res/jsp/user/browse_enc_image.jsp?no=2");
					rd.forward(request, response);
					
				}*/
				else if(type.equals("ext_key"))
				{
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~????????????????????????????????????");
					// Extracting The Text Data From Encrypted Img
					extractionKey = extraction_key1;
					
					
					
					
					String uid=session.getAttribute("user").toString();
					
					String userkeydata=User.getmsgkey(uid) ;
					
					String decryptedPassword = AESCrypt.decrypt(userkeydata);
					
					System.out.println("<<<userkeydata>>>>>>>"+decryptedPassword);

						System.out.println("Data Extraction Key : " + extractionKey);
						
						inFilePath = request.getRealPath("")+"\\Files\\Decryption\\enc_img."+ext;
						img = ImageEncrypt.readImage(inFilePath);
						
						//extractedData = HideProcess.extractProcess1(img,extractionKey,6);
						
						extractedData=HideProcess.extractProcess(img,"????",6);
						
						//
					     String msgLen="6";
					     int msgSize=0;
					     int msgLength =6;
					     
					     String[] info = extractedData.split("~"); 
					     
					     if(info.length > 0)
					     {
					    	 msgLen = info[0];
					    	 msgLength = Integer.parseInt(msgLen);
					    	 
					    	 
					    	 System.out.println("msgLength"+msgLength);
					    	 
					    	 
					    	 msgSize = msgLen.length();
					    	 msgSize = msgSize+1;
					    	 msgLength = msgLength+msgSize;
					    	 
					     }
					     
					     
					     extractedData = HideProcess.extractProcess(img,"????",msgLength);
					     extractedData = extractedData.substring(msgSize,msgLength);
					     
					     
					     
					     
					     System.out.println("extractedData:>>>>>>>>>>>>>"+extractedData);
					     
					     
					     
					     	String details[]=decryptedPassword.split("~");
							
							System.out.println("details[]"+details[0]);
							
							boolean flag77=false;
							
							
							String val="";
							String orgval="";
							for (int x=0;x<details.length;x++)
							{
								String[] d = details[x].split("=");
								
								System.out.println("d[]"+d[0]);
								
								
									String key = d[0];
									System.out.println("key>>>>>>>>>>"+key);
									
									System.out.println("extractionKey:"+extractionKey);
									if(key.trim().equals(extractionKey))
									{
				                	 
										orgval=val = d[1];
										System.out.println("aaaaaa>>>>>"+orgval);
										flag77=true;
										
										
										session.setAttribute("orgval", orgval);
										
									
									}
									
									
							
							//}
								
								System.out.println("flag77"+flag77);
								
							
								
								
								
							}
					     
					     
					//
					
						session.setAttribute("ext_data",extractedData);
						
						
						if(flag77)
						{
						rd=request.getRequestDispatcher("/res/jsp/user/browse_enc_image.jsp?no=2");
						rd.forward(request, response);
						}
						else
						{
							rd=request.getRequestDispatcher("/res/jsp/user/browse_enc_image.jsp?no1=2");
							rd.forward(request, response);	
						}
						
					
				}

				else
				{
					System.out.println("Opps,Something Went Wrong While Image Decryption Process!!!!!");
					rd=request.getRequestDispatcher("/res/jsp/user/browse_enc_image.jsp?no1=1");
					rd.forward(request, response);
				}
				
				
			}
			else
			{
				System.out.println("Opps,Something Went While Uploading The File!");
				System.out.println("Opps,Something Went Wrong While Image Decryption Process!!!!!");
				rd=request.getRequestDispatcher("/res/jsp/user/browse_enc_image.jsp?no1=1");
				rd.forward(request, response);
			}
		}
		catch(Exception e)
		{
			System.out.println("Opps's Error is in User==>DecryptImage Servlet : ");
        	e.printStackTrace();
        	out.println("Opps's Error is in User==>DecryptImage Servlet : "+e);
        	rd=request.getRequestDispatcher("/res/jsp/user/browse_enc_image.jsp?no1=1");
			try {
				rd.forward(request, response);
			} catch (ServletException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	
		}
	}
}
