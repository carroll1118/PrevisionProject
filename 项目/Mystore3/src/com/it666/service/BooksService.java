package com.it666.service;

import java.sql.SQLException;
import java.util.List;

import com.it666.dao.BooksDao;
import com.it666.domain.Books;

public class BooksService {
	private BooksDao booksDao = new BooksDao();
	
	
	public List<Books> getBooksWithCid(Integer cid) throws Exception {
		
		List<Books> classBooks = booksDao.getBooksWithCid(cid);
		
		return classBooks;
	}
	
	

	public List<Books> getAllBooks() throws SQLException {
		
		//1.从数据库中获取所有数据
//		GoodsDao goodsDao = new GoodsDao();
		List<Books> allBooks = booksDao.findAllBooks();
		return allBooks;
	}

public void deleteBooks(String id) throws Exception {
		
		//调用dao，让其删除
		booksDao.delBooks(Integer.parseInt(id));
		
	}

	public void addBooks(Books books) throws Exception {
		// 调用dao层   插入操作
		booksDao.addBooks(books);
		
	}

	public Books getBooksWithId(Integer id) throws Exception {
		
		Books books = booksDao.getBooksWithId(id);
		return books;
	}

	public void updateBooks(Books books) throws Exception {
		
		booksDao.updateBooks(books);
	}



	public List<Books> getBooksSearchName(String book_name) {
		// TODO Auto-generated method stub
		List<Books> allBooks = booksDao.getBooksSearchName(book_name);
		return allBooks;
	}



	public List<Books> getBooksWithis_host() throws Exception {
		List<Books> allBooks = booksDao.getBooksWithis_host();
		return allBooks;
	}



	public List<Books> getBooks() {
		List<Books> allBooks = booksDao.getBooks();
		return allBooks;
	}


	

}
