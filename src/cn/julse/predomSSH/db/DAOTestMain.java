/**
 * 
 */
package cn.julse.predomSSH.db;

import java.sql.SQLException;

/**
 * @author ���Ƕ�
 *
 */
public interface  DAOTestMain{
	/**
	 * ��ӷ�������
	 * @return 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void addTest() throws ClassNotFoundException,SQLException;
	/**
	 * �޸ķ�������
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void alterTest()throws ClassNotFoundException,SQLException;
	/**
	 * �õ��������ݲ���
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void getAllTest() throws ClassNotFoundException,SQLException;
	/**
	 * ɾ�����ݲ���
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void delteTest() throws ClassNotFoundException,SQLException;
}
