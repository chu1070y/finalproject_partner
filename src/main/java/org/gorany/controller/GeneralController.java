package org.gorany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.java.Log;

@Log
@Controller
public class GeneralController {

	@GetMapping("/index")
	public void index() {
		log.info("index......................page");
	}
	
	@GetMapping("/sales")
	public void sales() {
		log.info("sales......................page");
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
