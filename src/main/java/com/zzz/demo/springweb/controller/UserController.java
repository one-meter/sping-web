package com.zzz.demo.springweb.controller;

import com.zzz.demo.springweb.domain.Book;
import com.zzz.demo.springweb.domain.User;
import com.zzz.demo.springweb.repository.BookRepository;
import com.zzz.demo.springweb.repository.UserBookRepository;
import com.zzz.demo.springweb.repository.UserRepository;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述:
 *
 * @author 002864
 * @created 2018/5/24 14:55
 * @since v1.0.0
 */
@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private UserBookRepository userBookRepository;

	@PostMapping("/person/save")
	public User save(@RequestParam String name) {
		User user = new User();
		user.setName(name);
		if (userRepository.save(user)) {
			System.out.println("保存成功：" + user);
		}
		return user;
	}

	@PostMapping("/book/save")
	public Book saveBook(@RequestParam String name) {
		Book book = new Book();
		book.setName(name);
		book.setId(Math.random() * 100+"");
		book = bookRepository.save(book);
		System.out.println("保存成功：" + book);
		return book;
	}

	@PostMapping("/queryBook")
	public String queryBook(@RequestParam Integer userId) {
		List list = userBookRepository.queryBook(userId);
		System.out.println("-----list size:" + list.size());
		System.out.println("-----return:" + JSONArray.fromObject(list));
		return list.toString();
	}

}
