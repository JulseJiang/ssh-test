/**
 * 用于代码复用，即放置所有DB表操作类中的相同代码
 * 是所有DB表操作类的父类
 */
package com.ccniit.bookshop.db;

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
	 * 所有DB表操作类都共同拥有的变量
	 */
	protected Connection con = null;
	protected PreparedStatement pst = null;
	protected ResultSet rst = null;
	protected String sql = null;
	
	/**
	 * 获得PreparedStatement对象
	 * @param sql
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	protected PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException
	{
		//------加载数据库驱动---------------------
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//------获得数据库连接----------------------
		 con = DriverManager.getConnection("jdbc:sqlserver://100.1.0.46:1433;databaseName=bookShop_45", "sa", "sa");
		//-------封装SQL语句---------------------
		//String sql = "select * from users";
		 pst =  con.prepareStatement(sql);
		 
		 return pst;
	}
	/**
	 * 释放数据库连接
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
