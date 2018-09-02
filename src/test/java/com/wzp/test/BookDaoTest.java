package com.wzp.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.wzp.dao.BookDao;
import com.wzp.entity.Book;

public class BookDaoTest extends BaseTest{
 
	@Autowired
	private BookDao bookDao;
	
	@Test
	public void testQueryById(){
		Book book = bookDao.queryById(1000);
		System.out.println(book);
	}
	
	@Test
	public void testQueryAll(){
		List<Book> list = bookDao.queryAll(0, 4);
		for(Book book:list){
			System.out.println(book.getName()+"  "+book.getNumber());
		}
	}
	
	 @Test
	    public void testReduceNumber() throws Exception {
	        long bookId = 1000;
	        int update = bookDao.reduceNumber(bookId);
	        System.out.println("update=" + update);
	    }
}
