package com.company.service;

import java.util.List;

import com.company.dto.ProductVO;

public interface ProductService {
	// 상품에 대한 데이터를 전부 가져옴
	public List<ProductVO> selectProduct() throws Exception;
}
