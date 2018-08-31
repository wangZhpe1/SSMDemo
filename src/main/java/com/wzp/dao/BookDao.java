package com.wzp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wzp.entity.Book;

public interface BookDao {

	 Book queryById(long id);
	 
	 //��ҳ��ѯ����@Param����Ϊ�ӿ��ﳬ���������ϵĲ���mybatis�޷��Զ�ʶ��
	 List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);
	 
	 int reduceNumber(long bookId);
}
