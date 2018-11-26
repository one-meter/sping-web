package com.zzz.demo.springweb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *
 * @author 002864
 * @created 2018/11/26 14:07
 * @since v1.0.0
 */
@RestController
public class TestController {

	@Value("${server.port}")
	String port;

	@RequestMapping("/web_test")
	public String home() {
		return "hello world from port " + port;
	}

}
