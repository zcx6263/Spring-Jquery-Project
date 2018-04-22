package com.company.mapper;

import java.util.List;

import com.company.dto.ProductVO;

public interface ProductMapper {
	
	// 상품에 대한 데이터를 전부 가져옴
	public List<ProductVO> selectProduct() throws Exception;
	
	// 상품에 대한 세부정보를 view
	public ProductVO viewProduct(String id) throws Exception;
}
