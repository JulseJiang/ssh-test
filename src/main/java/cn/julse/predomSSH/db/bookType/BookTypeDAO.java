package com.ccniit.bookshop.db.bookType;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ccniit.bookshop.db.DBMain;
import com.ccniit.bookshop.db.book.Book;
import com.ccniit.bookshop.db.book.BookDAO;

public class BookTypeDAO extends DBMain<BookType>
{

	@Override
	public void add(BookType dataObj) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		String sqlStr = "insert bookType(bookType_id=?,bookType_name=?)";
		pst = getPreparedStatement(sqlStr);

		pst.setInt(1, dataObj.getBookType_id());
		pst.setString(2, dataObj.getBookType_name());

		pst.executeUpdate();

		realese();
	}

	@Override
	public BookType assemble() throws SQLException
	{
		// TODO Auto-generated method stub
		BookType b = new BookType();

		b.setBookType_id(rst.getInt("bookType_id"));
		b.setBookType_name(rst.getString("bookType_name"));

		return b;
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		String sqlStr = "delete from bookType where bookType_id=?";
		pst = getPreparedStatement(sqlStr);

		pst.setInt(1, id);

		pst.executeUpdate();

		realese();
	}

	@Override
	public ArrayList<BookType> getAll() throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		ArrayList<BookType> bookTypes = new ArrayList<BookType>();

		String sqlStr = "select * from bookType";
		pst = getPreparedStatement(sqlStr);

		rst = pst.executeQuery();
		BookType b = null;
		while (rst.next())
		{
			b = assemble();

			bookTypes.add(b);

		}

		realese();

		return bookTypes;
	}

	@Override
	public BookType getById(int id) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		String sql = "select * from bookType where bookType_id=?";
		pst = this.getPreparedStatement(sql);

		pst.setInt(1, id);

		rst = pst.executeQuery();

		BookType b = null;
		while (rst.next())
		{
			b = assemble();

			realese();

			return b;

		}
		return null;
	}

	@Override
	public void modify(BookType dataObj) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		String sqlStr = "update bookType set bookType_name=? where bookType_id=?";
		pst = getPreparedStatement(sqlStr);

		pst.setString(1, dataObj.getBookType_name());
		pst.setInt(2, dataObj.getBookType_id());

		pst.executeUpdate();
		realese();
	}

	
}
