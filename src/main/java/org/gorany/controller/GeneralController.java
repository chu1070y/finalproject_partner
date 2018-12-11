package org.gorany.controller;

import java.util.List;

import org.gorany.domain.mapper.OrderVO;
import org.gorany.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.Setter;
import lombok.extern.java.Log;

@Log
@Controller
public class GeneralController {

	@Setter(onMethod_= @Autowired)
	private OrderMapper ordermapper;
	
	@GetMapping("/index")
	public void index(Model model) throws Exception {
		log.info("index......................page");	
	
		//ordermapper
		//List<OrderVO> resultList = ordermapper.getOrder();
		model.addAttribute("result", ordermapper.getOrder());
		System.out.println("-=------------------------------>"+model);
		
	}
	
	@GetMapping("/menu")
	public void menu() {
		log.info("menu......................page");
	}
	
	@GetMapping("/superAdmin")
	public void superAdmin() {
		log.info("superAdmin......................page");
	}
	
	@GetMapping("/notice")
	public void notice() {
		log.info("notice......................page");
	}
	
	@GetMapping("/oneByone")
	public void oneByone() {
		log.info("oneByone......................page");
	}
	
	@GetMapping("/information")
	public void information() {
		log.info("information......................page");
	}
	
	
}
