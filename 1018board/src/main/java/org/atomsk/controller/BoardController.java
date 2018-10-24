package org.atomsk.controller;

import org.atomsk.domain.BoardVO;
import org.atomsk.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board/*")
@Log4j
@AllArgsConstructor
public class BoardController {
	
	private BoardService service;
	
	@GetMapping("/list")
	public void getList(Model model, @ModelAttribute("pageObj") BoardVO boardVO){
		model.addAttribute("list", service.getList(boardVO));
	}

}
