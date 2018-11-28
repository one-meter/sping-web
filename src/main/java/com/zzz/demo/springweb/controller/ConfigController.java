package com.zzz.demo.springweb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *
 * @author 002864
 * @created 2018/11/28 13:47
 * @since v1.0.0
 */
@RestController
public class ConfigController {

	@Value("database")
	String database;

	@RequestMapping("config_test")
	public String testConfig() {
		System.out.println("retch from profile:" + database);
		return "database value:" + database;
	}

}
