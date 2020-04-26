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
	 //1.�������ݿ�
	private QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
	
	public List<Books> findAllBooks() {
				
				//����ȫ����
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
	
	//2.���ͼ�鵽���ݿ�
		public void addBooks(Books books) throws SQLException {
			String sql = "insert into books(isbn,book_name,book_author,book_price,book_nackNo,book_status,book_edition,data_storage,book_gdesc,is_host,cid,book_image) value(?,?,?,?,?,?,?,?,?,?,?,?)";
			qr.update(sql, books.getIsbn(), books.getBook_name(),books.getBook_author(),books.getBook_price(),books.getBook_nackNo(),books.getBook_status(),books.getBook_edition(),books.getData_storage(),books.getBook_gdesc(),books.getIs_host(),books.getCid(),books.getBook_image());
			
		}
		//3.����id�����ݿ�ɾ��ͼ��
		public void delBooks(int id) throws SQLException {
		    String sql = "delete from books where id=?";
		    qr.update(sql,id);
		}
		//4.����ͼ��
		public void updateBooks(Books books) throws Exception {
			String sql = "update books set isbn=?,book_name=?,book_author=?,book_price=?,book_nackNo=?,book_status=?,book_edition=?,data_storage=?,book_gdesc=?,is_host=?,cid=?,book_image=? where id=?";
			qr.update(sql,books.getIsbn(), books.getBook_name(),books.getBook_author(),books.getBook_price(),books.getBook_nackNo(),books.getBook_status(),books.getBook_edition(),books.getData_storage(),books.getBook_gdesc(),books.getIs_host(),books.getCid(),books.getBook_image());
		}
	    //5.����id��ѯͼ��
		public Books getBooksWithId(Integer id) throws Exception{
			System.out.println(id);
			String sql = "select * from books where book_id=?";
			Books books = qr.query(sql, new BeanHandler<Books>(Books.class),id);
			System.out.println(books);
			return books;
		}
		    //6.��������ѯͼ��
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
                //7.ģ����ѯ����
				public List<Books> getBooksSearchName(String book_name) {
					//ע��where 1=1����һ��Ҫ���ո񣬷���ͺ�������ַ���ƴ�Ӻ󣬵����ݿ��ѯ����ִ���
			        String sql = "select * from books where 1=1 ";
			        //����һ�����������洢��ѯ�Ĳ�������Ϊ���ǲ�����ͻ��������뼸�������������ü��������
			        List<String> list = new ArrayList<String>();
			        if (book_name != "") {
			            //����û������book_name��Ϊ�գ�����Ҫ�����ַ���ƴ��
			            sql += "and book_name like ? ";
			            //���û�����Ĳ�����ӵ�����
			            list.add("%" + book_name + "%");
			        }
			        //��󽫼���ת��������
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
				//6.��ѯ����ͼ��
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
              //7.������Ϣ
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
