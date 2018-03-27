/**
 * ���ڴ��븴�ã�����������DB��������е���ͬ����
 * ������DB�������ĸ���
 */
package cn.julse.predomSSH.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Administrator
 *
 */
public abstract class DBMain<E>
{
	/**
	 * ����DB������඼��ͬӵ�еı���
	 */
	protected Connection con = null;
	protected PreparedStatement pst = null;
	protected ResultSet rst = null;
	protected String sql = null;
	
	/**
	 * ���PreparedStatement����
	 * @param sql
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	protected PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException
	{
		//------�������ݿ�����---------------------
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//------������ݿ�����----------------------
		 con = DriverManager.getConnection("jdbc:sqlserver://100.1.0.46:1433;databaseName=bookShop_45", "sa", "sa");
//		 con = DriverManager.getConnection("jdbc:sqlserver://100.0.101.25:1433;databaseName=bookShop", "sa", "sa");
		con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=bookshop", "sa", "sa");
		//-------��װSQL���---------------------
		//String sql = "select * from users";
		 pst =  con.prepareStatement(sql);
		 
		 return pst;
	}
	/**
	 * �ͷ����ݿ�����
	 * @throws SQLException
	 */
	public void realese() throws SQLException
	{
		if(rst != null)
		{
			rst.close();
		}
		if(pst != null)
		{
			pst.close();
		}
		if(con != null)
		{
			con.close();
		}

	}
	
	public abstract ArrayList<E> getAll() throws ClassNotFoundException,SQLException;
	
	public abstract E getById(int id) throws ClassNotFoundException,SQLException;
	
	public abstract void add(E dataObj) throws ClassNotFoundException,SQLException;
	
	public abstract void modify(E newDataObj) throws ClassNotFoundException,SQLException;
	
	public abstract void delete(int id) throws ClassNotFoundException,SQLException;
	
	public abstract  E assemble() throws SQLException;
	
	
}
