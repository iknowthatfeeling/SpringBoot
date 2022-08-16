package com.rabbit.form.rabbitRecruitment;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.dao.DataIntegrityViolationException;

import lombok.RequiredArgsConstructor;

/*@RequiredArgsConstructor*/
@Controller
@RequestMapping("/recruitment")
public class RabbitRecruitmentController {
	
	/* private final RecruitService recruitService;*/

	
	@GetMapping("/list")
	public String recruitmentList() {
		return "recruitment_list";
	}
	@GetMapping("/write")
	public String recruitmentWrite() {
		return "recruitment_list";
	}
	
	
}