/**
 * 
 */
package com.data.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import com.data.database.Database;

/**
 * @author  Munna Kumar Singh
 */
public class User extends DAO
{
	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;
	public boolean loginCHK(String name, String pass) 
	{
		boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_user where userid='"+name+"' and password='"+pass+"'");
			while(resultSet.next())
			{
				flag=true;
			}
			System.out.println("User Login Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-loginCHK()....."+e);
		}
		return flag;
	}
	public boolean register(String id, String pass, String name, String gender,String add, String city, String email, String cno) 
	{
		boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			int i=statement.executeUpdate("insert into m_user (userid,password,username,gender,address,city,email,phone) values('"+id+"','"+pass+"','"+name+"','"+gender+"','"+add+"','"+city+"','"+email+"','"+cno+"');");
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User Registeration Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-register()....."+e);
		}
		return flag;
	}
	public boolean CHK(String id) 
	{
		boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_user where userid='"+id+"'");
			while(resultSet.next())
			{
				flag=true;
			}
			System.out.println("User Login Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-CHK()....."+e);
		}
		return flag;
	}
	public ResultSet getProfile(String id)
	{
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_user where userid='"+id+"'");
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getProfile()....."+e);
		}
		return resultSet;
	}
	public boolean editProfile(String [] s) 
	{
		boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			int i=statement.executeUpdate("update m_user set username='"+s[1]+"',gender='"+s[2]+"',address='"+s[3]+"',city='"+s[4]+"',email='"+s[5]+"',phone='"+s[6]+"' where id='"+s[0]+"'");
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User Edit Profile Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-editProfile()....."+e);
		}
		return flag;
	}
	public boolean chnagePass(int id, String cpass)
	{
		boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			int i=statement.executeUpdate("update m_user set password='"+cpass+"' where id='"+id+"'");
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User Change Pass Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-chnagePass()....."+e);
		}
		return flag;
	}
	/* (non-Javadoc)
	 * @see com.nitin.DAOFactory.DAO#getUsers()
	 */
	@Override
	public ResultSet getUsers() 
	{
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_user");
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getUsers()....."+e);
		}
		return resultSet;
	}
	/* (non-Javadoc)
	 * @see com.nitin.DAOFactory.DAO#deleteUser(java.lang.String)
	 */
	@Override
	public boolean deleteUser(String id) {
		// TODO Auto-generated method stub
		return false;
	}
	/* (non-Javadoc)
	 * @see com.nitin.DAOFactory.DAO#getUsers(java.lang.String)
	 */
	@Override
	public ResultSet getUsers(String id) 
	{
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_group where grp_uid='"+id+"'");
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getUsers()....."+e);
		}
		return resultSet;
	}
	public static ResultSet getUsers(Vector v) 
	{
		try
		{
			String query="";
			for(int i=0;i<v.size();i++)
				query+=" userid!='"+v.get(i)+"' and";
			query = query.substring(0, query.length()-1);
			query = query.substring(0, query.length()-1);
			query = query.substring(0, query.length()-1);
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			System.out.println("select * from m_user where "+query+"");
			resultSet = statement.executeQuery("select * from m_user where "+query+"");
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getUsers()....."+e);
		}
		return resultSet;
	}
	public static boolean rmvGrp(String grp_in,String grp_uid)
	{
		boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			int i = statement.executeUpdate("delete from m_group where grp_uid='"+grp_uid+"' and grp_in='"+grp_in+"'");
			i = statement.executeUpdate("delete from m_group where grp_uid='"+grp_in+"' and grp_in='"+grp_uid+"'");
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User remove from group Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-rmvGrp()....."+e);
		}
		return flag;
	}
	public static boolean sendReq(String from,String to)
	{
		boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			int i = statement.executeUpdate("insert into m_request (req_from,req_to,req_status) value('"+from+"','"+to+"','pending')");
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User send req Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-rmvGrp()....."+e);
		}
		return flag;
	}
	public static String chkStatus(String id)
	{
		String status="";
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet  = statement.executeQuery("select req_status from m_request where req_to='"+id+"'");
			while(resultSet.next())
			{
				status=resultSet.getString(1);
			}
			System.out.println("User req Status : "+status);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-rmvGrp()....."+e);
		}
		return status;
	}
	public static String chkStatus(String user,String id)
	{
		String status="";
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet  = statement.executeQuery("select req_status from m_request where req_from='"+user+"' and req_to='"+id+"'");
			while(resultSet.next())
			{
				status=resultSet.getString(1);
			}
			System.out.println("User req Status : "+status);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-rmvGrp()....."+e);
		}
		return status;
	}
	public static boolean chkUpdate(String id)
	{
		boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet  = statement.executeQuery("select * from m_update where up_to='"+id+"' and flag='true'");
			while(resultSet.next())
			{
				flag=true;
			}
			System.out.println("User chaeck Update Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-rmvGrp()....."+e);
		}
		return flag;
	}
	public static Vector getReq(String id)
	{
		Vector <String> v=new Vector<String>();
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet  = statement.executeQuery("select req_from from m_request where req_to='"+id+"' and req_status='pending'");
			while(resultSet.next())
			{
				v.add(resultSet.getString(1));
			}
			System.out.println("User req from : "+v);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-rmvGrp()....."+e);
		}
		return v;
	}
	public static Vector getUpd(String id)
	{
		Vector <String> v=new Vector<String>();
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet  = statement.executeQuery("select up_msg from m_update where up_to='"+id+"' and flag='true'");
			while(resultSet.next())
			{
				v.add(resultSet.getString(1));
			}
			System.out.println("User update from : "+v);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-rmvGrp()....."+e);
		}
		return v;
	}
	public static boolean processRequest(String from , String to)
	{
		boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			int i = statement.executeUpdate("insert into m_group (grp_in,grp_uid) value('"+from+"','"+to+"')");
			i = statement.executeUpdate("insert into m_group (grp_uid,grp_in) value('"+from+"','"+to+"')");
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User process req Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-rmvGrp()....."+e);
		}
		return flag;
	}
	public static boolean changeStatus(String from,String to,String status)
	{
		boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			int i  = statement.executeUpdate("update m_request set req_status='"+status+"' where req_from='"+from+"' and req_to='"+to+"'");
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User change req Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-rmvGrp()....."+e);
		}
		return flag;
	}
	public static boolean changeStatus(String user)
	{
		boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			int i  = statement.executeUpdate("update m_update set flag='false' where up_to='"+user+"'");
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User change req Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-rmvGrp()....."+e);
		}
		return flag;
	}
	public static boolean update(String from,String to,String msg)
	{
		boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			int i  = statement.executeUpdate("insert into m_update (up_from,up_to,up_msg,flag) values('"+from+"','"+to+"','"+msg+"','true')");
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User update Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-rmvGrp()....."+e);
		}
		return flag;
	}
	
	@Override
	public ArrayList<String> getGroupMembers(String username) 
	{
		String sql = "";
		String member = "";
		ArrayList<String> list = new ArrayList<String>();
		
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			sql ="select grp_in from m_group where grp_uid='"+username+"'";
			System.out.println("*********** Getting The Group Members Info ***********");
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
			while(resultSet.next())
			{
				member = resultSet.getString(1);
				list.add(member);
			}
            System.out.println("Members["+username+"] : " + list);
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getGroupMembers(String username) : ");
			e.printStackTrace();
		}
		
		return list;
	}
	
	/* (non-Javadoc)
	 * @see com.nitin.DAOFactory.DAO#editUser(java.lang.String[])
	 */
	@Override
	public boolean editUser(String[] s) {
		// TODO Auto-generated method stub
		return false;
	}
	/* (non-Javadoc)
	 * @see com.nitin.DAOFactory.DAO#getAuditors()
	 */
	@Override
	public ResultSet getAuditors() {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see com.nitin.DAOFactory.DAO#CHKAuditor(java.lang.String)
	 */
	@Override
	public boolean CHKAuditor(String id) {
		// TODO Auto-generated method stub
		return false;
	}
	/* (non-Javadoc)
	 * @see com.nitin.DAOFactory.DAO#addAuditor(java.lang.String[])
	 */
	@Override
	public boolean addAuditor(String[] s) {
		// TODO Auto-generated method stub
		return false;
	}
	/* (non-Javadoc)
	 * @see com.nitin.DAOFactory.DAO#deleteAuditor(java.lang.String)
	 */
	@Override
	public boolean deleteAuditor(String s) {
		// TODO Auto-generated method stub
		return false;
	}
	/* (non-Javadoc)
	 * @see com.nitin.DAOFactory.DAO#editAuditor(java.lang.String[])
	 */
	@Override
	public boolean editAuditor(String[] s) {
		// TODO Auto-generated method stub
		return false;
	}
	/* (non-Javadoc)
	 * @see com.nitin.DAOFactory.DAO#getAuditors(java.lang.String)
	 */
	@Override
	public ResultSet getAuditors(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public static void main(String asdf[])
	{
		
	}
	@Override
	public ResultSet getMembersInfo(String members) 
	{
		String sql = "";
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			sql = "select email,username from m_user where userid in("+members+") order by username";
			System.out.println("*********** Getting The Members Emailid And Name Info ***********");
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getMembersInfo(String members) :  ");
			e.printStackTrace();
		}
		return resultSet;
	}
	
	
	public static boolean insertuserdatakey(String uid,String datasplit,String imagekey)
	{
		boolean flag=false;
		boolean flag1=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from userimage_details where user_id='"+uid+"'  ");
			while(resultSet.next())
			{
				flag1=true;
			}
			if(flag1)
			{
				int i  = statement.executeUpdate("delete from userimage_details where user_id='"+uid+"'");
			}
			
			int i  = statement.executeUpdate("insert into userimage_details(user_id,user_msg_key,image_key) values('"+uid+"','"+datasplit+"','"+imagekey+"')");
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User update Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-rmvGrp()....."+e);
		}
		return flag;
		
	}
	public static String getmsgkey(String username) 
	{
		ResultSet rs=null;
		String userdatakey=null;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			String sql="select user_msg_key from userimage_details where user_id='"+username+"'";
			
			rs=statement.executeQuery(sql);
			while(rs.next())
			{
				userdatakey=rs.getString(1);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getmsgkey()....."+e);
		}
		
		return userdatakey;
	}
	public static String imagekey(String uid)
	{
		ResultSet rs=null;
		String userdatakey=null;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			String sql="select image_key from userimage_details where user_id='"+uid+"'";
			
			rs=statement.executeQuery(sql);
			System.out.println("rd>>>>>>>>>>>>>>>"+rs);
			while(rs.next())
			{
				userdatakey=rs.getString(1);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-imagekey()....."+e);
		}
		
		return userdatakey;
	}
	
	
	
}
