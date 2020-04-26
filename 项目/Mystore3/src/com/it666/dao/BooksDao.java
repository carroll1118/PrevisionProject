package com.it666.dao;

import java.net.ConnectException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Soundbank;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.it666.domain.Books;
import com.it666.utils.JdbcUtil;
import com.mysql.jdbc.Connection;

public class BooksDao {
	 //1.连接数据库
	private QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
	
	public List<Books> findAllBooks() {
				
				//查找全部书
				String sql = "select * from books";
				List<Books> allBooks = null;   //????
				try {
					allBooks = qr.query(sql, new BeanListHandler<Books>(Books.class));
					System.out.println(allBooks);
				} catch (SQLException e) {
					e.printStackTrace();
				}
                //System.out.println(allbooks);
				return allBooks;
	}
	
	//2.添加图书到数据库
		public void addBooks(Books books) throws SQLException {
			String sql = "insert into books(isbn,book_name,book_author,book_price,book_nackNo,book_status,book_edition,data_storage,book_gdesc,is_host,cid,book_image) value(?,?,?,?,?,?,?,?,?,?,?,?)";
			qr.update(sql, books.getIsbn(), books.getBook_name(),books.getBook_author(),books.getBook_price(),books.getBook_nackNo(),books.getBook_status(),books.getBook_edition(),books.getData_storage(),books.getBook_gdesc(),books.getIs_host(),books.getCid(),books.getBook_image());
			
		}
		//3.根据id从数据库删除图书
		public void delBooks(int id) throws SQLException {
		    String sql = "delete from books where id=?";
		    qr.update(sql,id);
		}
		//4.更新图书
		public void updateBooks(Books books) throws Exception {
			String sql = "update books set isbn=?,book_name=?,book_author=?,book_price=?,book_nackNo=?,book_status=?,book_edition=?,data_storage=?,book_gdesc=?,is_host=?,cid=?,book_image=? where id=?";
			qr.update(sql,books.getIsbn(), books.getBook_name(),books.getBook_author(),books.getBook_price(),books.getBook_nackNo(),books.getBook_status(),books.getBook_edition(),books.getData_storage(),books.getBook_gdesc(),books.getIs_host(),books.getCid(),books.getBook_image());
		}
	    //5.根据id查询图书
		public Books getBooksWithId(Integer id) throws Exception{
			System.out.println(id);
			String sql = "select * from books where book_id=?";
			Books books = qr.query(sql, new BeanHandler<Books>(Books.class),id);
			System.out.println(books);
			return books;
		}
		    //6.根据类别查询图书
				public List<Books> getBooksWithCid(Integer  cid) throws Exception{
					
					String sql = "select * from books where cid=?";
					List<Books> books = null;
					try {
						books = qr.query(sql, new BeanListHandler<Books>(Books.class),cid);

					} catch (SQLException e) {
						e.printStackTrace();
					}
	         
					return books;
				}
                //7.模糊查询书名
				public List<Books> getBooksSearchName(String book_name) {
					//注意where 1=1后面一定要留空格，否则和后面进行字符串拼接后，到数据库查询会出现错误
			        String sql = "select * from books where 1=1 ";
			        //创建一个集合用来存储查询的参数，因为我们不清楚客户到底输入几个参数，所以用集合来存放
			        List<String> list = new ArrayList<String>();
			        if (book_name != "") {
			            //如果用户输入的book_name不为空，那需要进行字符串拼接
			            sql += "and book_name like ? ";
			            //将用户输入的参数添加到集合
			            list.add("%" + book_name + "%");
			        }
			        //最后将集合转化成数组
			        Object[] params = list.toArray();

					List<Books> books = null;   
					try {
						books = qr.query(sql, new BeanListHandler<Books>(Books.class),params);
                       // System.out.println(books);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					return books;
				}
				//6.查询热门图书
				public List<Books> getBooksWithis_host() throws Exception{
					
					String sql = "select * from books where is_host=?";
					List<Books> books = null;
					try {
						books = qr.query(sql, new BeanListHandler<Books>(Books.class),1);
						System.out.println(books);

					} catch (SQLException e) {
						e.printStackTrace();
					}
	         
					return books;
				}
              //7.借书信息
				public List<Books> getBooks() {
					String sql = "select * from transaction";
					List<Books> books = null;
					try {
						books = qr.query(sql, new BeanListHandler<Books>(Books.class));
						//System.out.println(books);

					} catch (SQLException e) {
						e.printStackTrace();
					}
					return books;
				}

}
