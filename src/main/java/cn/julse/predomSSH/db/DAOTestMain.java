/**
 * 
 */
package com.ccniit.bookshop.db;

import java.sql.SQLException;

/**
 * @author 黄亚东
 *
 */
public interface  DAOTestMain{
	/**
	 * 添加方法测试
	 * @return 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void addTest() throws ClassNotFoundException,SQLException;
	/**
	 * 修改方法测试
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void alterTest()throws ClassNotFoundException,SQLException;
	/**
	 * 得到所有数据测试
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void getAllTest() throws ClassNotFoundException,SQLException;
	/**
	 * 删除数据测试
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void delteTest() throws ClassNotFoundException,SQLException;
}
