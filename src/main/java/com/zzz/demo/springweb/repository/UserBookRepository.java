package com.zzz.demo.springweb.repository;

import com.zzz.demo.springweb.domain.UserBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 描述:
 *
 * @author 002864
 * @created 2018/11/22 17:05
 * @since v1.0.0
 */
@Repository
public interface UserBookRepository extends JpaRepository<UserBook, Integer> {

    @Query("select ub from UserBook ub where ub.user.id = ?1 ")
    List<UserBook> queryBook(Integer userId);

}
