package com.cogent.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cogent.boot.pojo.Book;
@Repository

public interface BookRepo extends JpaRepository<Book, Long>{
	/**
	@Transactional
	@Modifying	
 @Query("update Book u set u.book =?2 where u.bookId =?1")
	void updateById(long bookId,Book book);
**/   	

}
//("update Book u set b.book = :book where u.bookId = :bookId")
	//void updateById(@Param(value ="bookId") long bookId,@Param(value="book") Book book);