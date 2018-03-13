/**
 * 
 */
package com.ccniit.bookshop.db.user;

import com.ccniit.bookshop.db.userGroup.UserGroup;

/**
 * @author »ÆÑÇ¶«
 *
 */
public class Users {
	private int user_id;
	private int userGroup_id;
	private String user_name;

	private String user_address;
	private String user_code;
	private String user_phone;
	private String user_email;
	private String user_password;
	private UserGroup userGroup;
	
	
	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the userGroup_id
	 */
	public int getUserGroup_id() {
		return userGroup_id;
	}
	/**
	 * @param userGroup_id the userGroup_id to set
	 */
	public void setUserGroup_id(int userGroup_id) {
		this.userGroup_id = userGroup_id;
	}
	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}
	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	/**
	 * @return the user_address
	 */
	public String getUser_address() {
		return user_address;
	}
	/**
	 * @param user_address the user_address to set
	 */
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	/**
	 * @return the user_code
	 */
	public String getUser_code() {
		return user_code;
	}
	/**
	 * @param user_code the user_code to set
	 */
	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}
	/**
	 * @return the user_phone
	 */
	public String getUser_phone() {
		return user_phone;
	}
	/**
	 * @param user_phone the user_phone to set
	 */
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	/**
	 * @return the user_email
	 */
	public String getUser_email() {
		return user_email;
	}
	/**
	 * @param user_email the user_email to set
	 */
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	/**
	 * @return the user_password
	 */
	public String getUser_password() {
		return user_password;
	}
	/**
	 * @param user_password the user_password to set
	 */
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String toString() {
		if(userGroup != null){
			return this.user_id+"\t"+userGroup_id+"\t"+user_name+"\t"
			+user_address+"\t"+user_code+"\t"+user_phone+"\t"+user_email+"\t"+user_password+"\t"+userGroup;
		}else{
			return this.user_id+"\t"+userGroup_id+"\t"+user_name+"\t"
			+user_address+"\t"+user_code+"\t"+user_phone+"\t"+user_email+"\t"+user_password+"\t";
		}
		
	}
	/**
	 * @return the userGroup
	 */
	public UserGroup getUserGroup() {
		return userGroup;
	}
	/**
	 * @param userGroup the userGroup to set
	 */
	public void setUserGroup(UserGroup userGroup) {
		this.userGroup = userGroup;
	}
	
	

	
}
