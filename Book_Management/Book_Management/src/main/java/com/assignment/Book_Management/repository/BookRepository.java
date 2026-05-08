package com.assignment.Book_Management.repository;

import com.assignment.Book_Management.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Books, Long> {

    List<Books> findByAuthor(String author);

    //jpql query
    @Query("select e from Books e where e.author= :n")
    List<Books> findBookByAuthor(@Param("n") String author);

    // Native Query
    @Query(value = "select * from Books where author_name= :n", nativeQuery = true)
    List<Books> findBookByAuthorName(@Param("n") String author);
}


