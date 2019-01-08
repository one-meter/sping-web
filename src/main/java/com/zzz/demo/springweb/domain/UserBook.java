package com.zzz.demo.springweb.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 描述:
 *
 * @author 002864
 * @created 2018/11/22 17:01
 * @since v1.0.0
 */
@Entity
@Table(name = "test_user_book")
@Data
public class UserBook {

    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 用户id
     */
    @JoinColumn(name = "user_id")
    @ManyToOne
    private User    user;

    /**
     * 书id
     */
    @JoinColumn(name = "book_id")
    @ManyToOne
    private Book    book;

    /**
     * 时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date    rentTime;

}
