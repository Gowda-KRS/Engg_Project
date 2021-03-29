package com.user.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hidedatakey 
{
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException
	{
		
		
		String strfile=Hidedatakey.getkeymsg();
		String strfile1=Hidedatakey.Readfile();
		
		
		
	}
	
	
	// get key and message and writing into file
	
	public static String getkeymsg() throws IOException
	{
		String str="";
		
		
		String[] key=new String[3],msgkey=new String[3];
		
		String datasplit="";
		int i;
		for (i = 0; i < key.length;i++)
		{
			System.out.println("Enter the key:");
			key[i] = scanner.nextLine();
			System.out.println("Enter the Message:");
			msgkey[i]= scanner.nextLine();
			datasplit=datasplit+"~"+key[i]+"="+msgkey[i];
			
        }
		//for (i = 0; i < key.length;i++){
		
		System.out.println("<<<<<<<datasplit>>>>>>>>>>>:"+datasplit.replaceFirst(""+datasplit.charAt(0), ""));
		
		datasplit=datasplit.replaceFirst(""+datasplit.charAt(0), "");
		FileOutputStream fos=null;
		
		File file=new File("temp\\hidedata.txt");
		try 
		{
			fos = new FileOutputStream(file);
			if (!file.exists()) {
			     file.createNewFile();
			  }
			 
			 byte[] bytesArray = datasplit.getBytes();

			  fos.write(bytesArray);
			  fos.flush();
			  System.out.println("File Written Successfully");
			  
			 
			  
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return str;	
		
	}
	
	
	
	
	
	
	//reading File and search value by key from file
	public static String Readfile()
	{
		String str="";
		BufferedReader br = null;

		try 
		{

			String sCurrentLine;

			br = new BufferedReader(new FileReader("temp\\hidedata.txt"));

			while ((sCurrentLine = br.readLine()) != null) 
			{
				System.out.println(sCurrentLine);
			
			
			
				System.out.println("Enter key:");
				String usrkey=scanner.next();
		
			
				String[] details = sCurrentLine.split("~");
				for (int x=0;x<details.length;x++)
				{
					String[] d = details[x].split("=");
					/*if(d.length == 2)
					{
						*/
						String key = d[0];
						String val = d[1];
						if(key.equals(usrkey))
						{
	                	 
							System.out.println("key is:"+usrkey+"~"+"Value found:"+val);
						
						}
						else
						{
							System.out.println("key is not found");
						}
						
				}
				
				//}
			
			}
			/*String variables = "abcd=32434, xxxx=23423, yyy=234234, zzz=23423";
            
	        String[] details = variables.split(",");
	        for (int x=0;x<details.length;x++)
	        {
	            String[] d = details[x].split("=");
	            if(d.length == 2)
	            {
	                String key = d[0];
	                String val = d[1];
	                if(key.equals("yyy"))
	                {
	                    System.out.println("Value found:"+val);
	                }
	            }
	        }*/
			
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		} 
		finally
		{
			try 
			{
				if (br != null)br.close();
			} 
			catch (IOException ex) 
			{
				ex.printStackTrace();
			}
		
		
		
		}
		return str;	
	}
	
	
	
}
