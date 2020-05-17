package com.javains.bootintro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	@RequestMapping(value="/hello")
	@ResponseBody
	public String demoMethod()
{
	return "<!DOCTYPE html>\n" + 
			"<html>\n" + 
			"<body>\n" + 
			"\n" + 
			"<h1>HTML Основной документ</h1>\n" + 
			"\n" + 
			"<p>Мой первый параграф.</p>\n" + 
			"\n" + 
			"</body>\n" + 
			"</html>\n" + 
			"\n" + 
			"";
}
}
