package com.wzp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wzp.entity.Book;

public interface BookDao {

	 Book queryById(long id);
	 
	 //分页查询，加@Param是因为接口里超过两个以上的参数mybatis无法自动识别。
	 List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);
	 
	 int reduceNumber(long bookId);
}
