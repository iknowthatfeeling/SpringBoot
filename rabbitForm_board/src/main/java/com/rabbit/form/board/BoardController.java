package com.rabbit.form.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.rabbit.form.rabbitUser.RequiredArgsConstructor;

//@RequiredArgsConstructor
@Controller
@RequestMapping("/board")
public class BoardController {

	@GetMapping("/list")
	public String boardList() {
		return "board_list";
	}
	@GetMapping("/write")
	public String boardWrite() {
		return "board_Write";
	}
	@GetMapping("/read")
	public String boardRead() {
		return "board_Read";
	}
}
