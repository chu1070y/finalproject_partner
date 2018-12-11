package org.gorany.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.gorany.domain.mapper.OrderVO;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OrderMapper {

	
	List<OrderVO> getOrder();
	
}
