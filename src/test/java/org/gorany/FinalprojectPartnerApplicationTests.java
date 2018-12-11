package org.gorany;

import org.gorany.domain.mapper.OrderVO;
import org.gorany.mapper.OrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.Setter;
import lombok.extern.java.Log;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log
public class FinalprojectPartnerApplicationTests {
	
	@Setter(onMethod_= @Autowired)
	private OrderMapper mapper;
	
	
	@Test
	public void ordermapper() {
		
		System.out.println(mapper.getOrder());
	}

	@Test
	public void contextLoads() {
	}

}
