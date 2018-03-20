/**
 * 
 */
package cn.julse.predomSSH.db.user;

import cn.julse.predomSSH.db.DBMain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 * @author 黄亚东
 *
 */
public class UserDAO extends DBMain<Users> {

	public void add(Users user) throws ClassNotFoundException, SQLException {
		sql = "insert users(userGroup_id,user_name,user_address,user_code,user_phone,user_email,user_password) values(?,?,?,?,?,?,?)";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, user.getUserGroup_id());
		pst.setString(2, user.getUser_name());
		pst.setString(3, user.getUser_address());
		pst.setString(4, user.getUser_code());
		pst.setString(5, user.getUser_phone());
		pst.setString(6, user.getUser_email());
		pst.setString(7, user.getUser_password());
		pst.executeUpdate();
		this.realese();
		
	}
	public void delete(int id) throws ClassNotFoundException, SQLException {
		sql = "delete users where user_id = ?";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, id);
		pst.executeUpdate();
		this.realese();
		
	}
	public void delete(int[] ids) throws ClassNotFoundException, SQLException {
		sql = "delete users where user_id = ?";
		pst = this.getPreparedStatement(sql);
		for(int i=0;i<ids.length;i++)
		{
			pst.setInt(1, ids[i]);
			pst.executeUpdate();
		}
		this.realese();
		
	}
	/**
	 * 得到所有用户
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public ArrayList<Users> getAll() throws ClassNotFoundException, SQLException {
		ArrayList<Users> users = new ArrayList<Users>();
		Users user = null;
		sql = "select * from users";
		pst = this.getPreparedStatement(sql);
		rst = pst.executeQuery();
		while(rst.next()){
			user = assemble();
			users.add(user);
		}
		return users;
	}

	/**
	 * 根据编号得到用户
	 * @param id
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public Users getById(int id) throws ClassNotFoundException, SQLException {
		sql = "select * from users where user_id = ?";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, id);
		rst = pst.executeQuery();
		Users u = null;
		while(rst.next()){
			u = assemble();
		}
		realese();
		return u;
	}
	
	public Users getByEmail(String user_email) throws ClassNotFoundException, SQLException {
		sql = "select * from users where user_email = ?";
		pst = this.getPreparedStatement(sql);
		pst.setString(1, user_email);
		rst = pst.executeQuery();
		Users u = null;
		while(rst.next()){
			u = assemble();
		}
		realese();
		return u;
	}
	public ArrayList<String> getAllCanUsedFunction(int user_id) throws ClassNotFoundException, SQLException
	{
		ArrayList<String> canUsedFunctions = new ArrayList<String>();
		String sql = "select functions.function_name from users,userGroup,predom,functions where users.userGroup_id=userGroup.usergroup_id and userGroup.usergroup_id = predom.userGroup_id and predom.function_ID = functions.function_id and users.user_id = ?";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, user_id);
		rst = pst.executeQuery();
		while(rst.next()){
			canUsedFunctions.add(rst.getString("function_name"));
		}
		realese();
		return canUsedFunctions;
	}

	
	public void modify(Users newUser) throws ClassNotFoundException,
			SQLException {
		sql = "update users set userGroup_id = ?,user_name=?,user_address=?,user_code=?,user_phone=?,user_email=?,user_password=? where user_id = ?";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, newUser.getUserGroup_id());
		pst.setString(2, newUser.getUser_name());
		pst.setString(3, newUser.getUser_address());
		pst.setString(4, newUser.getUser_code());
		pst.setString(5, newUser.getUser_phone());
		pst.setString(6, newUser.getUser_email());
		pst.setString(7, newUser.getUser_password());
		pst.setInt(8, newUser.getUser_id());
		pst.executeUpdate();
		this.realese();
		
	}
	
	/**
	 * 对数据库中的数据封装成Users类传回
//	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public Users  assemble() throws SQLException{
		Users u = new Users();
		u.setUser_id(rst.getInt("user_id"));
		u.setUserGroup_id(rst.getInt("userGroup_id"));
		u.setUser_name(rst.getString("user_name"));
		u.setUser_address(rst.getString("user_address"));
		u.setUser_code(rst.getString("user_code"));
		u.setUser_phone(rst.getString("user_phone"));
		u.setUser_email(rst.getString("user_email"));
		u.setUser_password(rst.getString("user_password"));
		return u;
	}
	

	

}
