package com.rabbit.form.rabbitBoard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RabbitBoardController {

	 @RequestMapping("/hello")
	 @ResponseBody
	        public String hello() {
	        return "Hello World";
	    }
}
