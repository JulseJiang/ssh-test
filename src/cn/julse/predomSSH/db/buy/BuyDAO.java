/**
 * 
 */
package cn.julse.predomSSH.db.buy;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.julse.predomSSH.db.DBMain;
import cn.julse.predomSSH.db.book.BookDAO;
import cn.julse.predomSSH.db.user.UserDAO;

/**
 * @author ���Ƕ�
 *
 */
public class BuyDAO extends DBMain<Buy>{
	@Override
	public void add(Buy dataObj) throws ClassNotFoundException, SQLException {
		sql = "insert buy(book_id,users_id,buy_num,orders_id) values(?,?,?,?)";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, dataObj.getBook_id());
		pst.setInt(2, dataObj.getUsers_id());
		pst.setInt(3, dataObj.getBuy_num());
		pst.setInt(4, dataObj.getOrders_id());
		pst.executeUpdate();
		this.realese();
	}

	@Override
	public Buy assemble() throws SQLException {
		Buy buy = new Buy();
		buy.setBook_id(rst.getInt("book_id"));
		buy.setUsers_id(rst.getInt("users_id"));
		buy.setBuy_num(rst.getInt("buy_num"));
		buy.setOrders_id(rst.getInt("orders_id"));
		this.realese();
		return buy;
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		sql = "delete buy where buy_id = ?";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, id);
		pst.executeUpdate();
		this.realese();
	}

	@Override
	public ArrayList<Buy> getAll() throws ClassNotFoundException, SQLException {
		ArrayList<Buy> buys = new ArrayList<Buy>();
		sql = "select * from buy";
		pst = this.getPreparedStatement(sql);
		rst = pst.executeQuery();
		Buy buy = null;
		while(rst.next()){
			buy = this.assemble();
			buys.add(buy);
		}	
		this.realese();
		return buys;
	}

	@Override
	public Buy getById(int id) throws ClassNotFoundException, SQLException {
		Buy buy = null;
		sql = "select * from buy where buy_id = ?";
		pst =this.getPreparedStatement(sql);
		pst.setInt(1, id);
		rst = pst.executeQuery();
		while(rst.next()){
			buy = this.assemble();
		}
		this.realese();
		return buy;
	}

	@Override
	public void modify(Buy newDataObj) throws ClassNotFoundException,
			SQLException {
		sql = "updata buy set book_id = ?,users_id = ?,buy_num = ?,orders_id = ? where buy_id = ?";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, newDataObj.getBook_id());
		pst.setInt(2, newDataObj.getUsers_id());
		pst.setInt(3, newDataObj.getBuy_num());
		pst.setInt(4, newDataObj.getOrders_id());
		pst.setInt(5, newDataObj.getBuy_id());
		pst.executeUpdate();
	}
	

}
