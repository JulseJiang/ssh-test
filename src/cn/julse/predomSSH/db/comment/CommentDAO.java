package cn.julse.predomSSH.db.comment;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.julse.predomSSH.db.comment.Comment;
import cn.julse.predomSSH.db.DBMain;
import cn.julse.predomSSH.db.book.Book;
import cn.julse.predomSSH.db.book.BookDAO;

public class CommentDAO extends DBMain<Comment>
{

	@Override
	public void add(Comment dataObj) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		String sqlStr = "insert comment(book_id=?,user_id=?,comment_content=?)";
		pst = getPreparedStatement(sqlStr);

		pst.setInt(1, dataObj.getBook_id());
		pst.setInt(2, dataObj.getUser_id());
		pst.setString(3, dataObj.getComment_content());

		pst.executeUpdate();

		realese();
	}

	@Override
	public Comment assemble() throws SQLException
	{
		// TODO Auto-generated method stub
		Comment c = new Comment();

		c.setBook_id(rst.getInt("book_id"));
		c.setUser_id(rst.getInt("user_id"));
		c.setComment_content(rst.getString("comment_content"));

		return c;
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		String sqlStr = "delete from comment where comment_id=?";
		pst = getPreparedStatement(sqlStr);

		pst.setInt(1, id);

		pst.executeUpdate();

		realese();
	}

	@Override
	public ArrayList<Comment> getAll() throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		ArrayList<Comment> Comments = new ArrayList<Comment>();

		String sqlStr = "select * from comment";
		pst = getPreparedStatement(sqlStr);

		rst = pst.executeQuery();
		Comment c = null;
		while (rst.next())
		{
			c = assemble();

			Comments.add(c);

		}

		realese();

		return Comments;
	}

	@Override
	public Comment getById(int id) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		String sql = "select * from comment where comment_id=?";
		pst = this.getPreparedStatement(sql);

		pst.setInt(1, id);

		rst = pst.executeQuery();

		Comment c = null;
		while (rst.next())
		{
			c = assemble();

			realese();

			return c;

		}
		return null;
	}

	@Override
	public void modify(Comment dataObj) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		String sqlStr = "update comment set book_id=?,user_id=?,comment_content=? where comment_id=?";
		pst = getPreparedStatement(sqlStr);

		pst.setInt(1, dataObj.getBook_id());
		pst.setInt(2, dataObj.getUser_id());
		pst.setString(2, dataObj.getComment_content());

		pst.executeUpdate();
		realese();
	}
	
}
