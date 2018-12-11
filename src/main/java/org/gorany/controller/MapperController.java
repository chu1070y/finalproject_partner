package org.gorany.controller;

import org.gorany.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MapperController {
	
	@Autowired
	private OrderMapper ordermapper;
	

}
