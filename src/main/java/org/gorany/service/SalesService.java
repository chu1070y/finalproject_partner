package org.gorany.service;

import java.util.List;

import org.gorany.domain.mapper.SalesVO;

public interface SalesService {

	public List<SalesVO> getDailySales();
	
	public List<SalesVO> getWeeklySales();
	
	public List<SalesVO> getMonthlySales();
}
