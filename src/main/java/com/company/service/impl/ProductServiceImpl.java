package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dto.ProductVO;
import com.company.mapper.ProductMapper;
import com.company.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper mapper;

	@Override
	public List<ProductVO> selectProduct() throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectProduct();
	}
	
	
}
